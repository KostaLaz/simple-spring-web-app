package com.springtutorial.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String showLogin(Model model) {

		User user1 = new User();
		model.addAttribute("user1", user1);
		
		return "login";
	}
	
	@PostMapping
	public String processLogin(@ModelAttribute("user1") User user1, Model model) {
		
		return "createoffer";
	}

}
