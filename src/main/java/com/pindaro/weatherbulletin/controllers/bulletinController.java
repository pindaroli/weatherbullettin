package com.pindaro.weatherbulletin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pindaro.weatherbulletin.services.WeatherService;

@RestController
@RequestMapping("/api")
public class bulletinController {
	@Autowired
	WeatherService serv;
	@RequestMapping("/hello")
	public String index() {
		System.out.println(serv.chiamaIlClient());
		return "Greetings from Spring Boot!";
	}

}