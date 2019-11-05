package com.springtutorial.spring.web.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springtutorial.spring.web.dao.User;
import com.springtutorial.spring.web.service.UsersService;

@Controller
public class LoginController {
	
	private UsersService usersService;
	
   @Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("/login")
	public String showLogin(Model model) {

		
		return "login";
	}
	
	@RequestMapping("/newaccount")
	public String showNewAccount(Model model) {

		model.addAttribute("user", new User());
		return "newaccount";
	}
	
	
	@RequestMapping("/createaccount")
	public String createAccount(@Valid User user, BindingResult result) {

		if (result.hasErrors()) {
			
			return "newaccount";
			
		} 
		
		user.setEnabled(true);
		
		user.setAuthority("admin");
		try {
			usersService.create(user);
		} catch (DuplicateKeyException e) {
			result.rejectValue("username", "DuplicateKey.user.username", "This username already exists.");
		}
		
		
		return "accountcreated";

	}
	


}
