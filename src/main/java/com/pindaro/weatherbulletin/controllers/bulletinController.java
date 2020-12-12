package com.pindaro.weatherbulletin.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class bulletinController {

	@RequestMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}