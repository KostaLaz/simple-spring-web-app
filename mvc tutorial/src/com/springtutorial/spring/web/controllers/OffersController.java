package com.springtutorial.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {

	@RequestMapping("/")
	public String showHome(Model model) {
		
		model.addAttribute("name", "Tifany");
		
		return "home";
		
	}


}
