package com.springtutorial.spring.web.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfferController {

	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
}
