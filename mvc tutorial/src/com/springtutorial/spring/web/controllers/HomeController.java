package com.springtutorial.spring.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

	@RequestMapping("/")
	public String showHome() {

		return "home";

	}

}
