package com.pindaro.weatherbulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import com.pindaro.weatherbulletin.services.WeatherService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
public class WeatherbulletinApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WeatherbulletinApplication.class, args);
		
	}

}
