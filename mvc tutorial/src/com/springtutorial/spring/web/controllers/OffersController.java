package com.springtutorial.spring.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springtutorial.spring.web.dao.Offer;
import com.springtutorial.spring.web.service.OffersService;


@Controller
public class OffersController {

	private OffersService offersService;

	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/offers")
	public String showOffers(Model model) {
		
		offersService.throwTestExeption();

		List<Offer> offers = offersService.getCurrent();

		model.addAttribute("offers", offers);

		return "offers";

	}
	
	@ExceptionHandler(DataAccessException.class)
	public String handleDataBaseExeption(DataAccessException ex) {
		
		return "error";
	}

	@RequestMapping("/test")
	public String showTest(Model model) {

		return "home";
	}

	@RequestMapping("/createoffer")
	public String createOffers(Model model) {
		Offer offer = new Offer();
		model.addAttribute("offer", offer );
		
		return "createoffer";

	}

	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Offer offer, BindingResult result) {

		if (result.hasErrors()) {
			
			return "createoffer";
			
		} 
		
		offersService.create(offer);
		
		return "offercreated";

	}

}
