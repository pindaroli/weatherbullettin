package com.pindaro.weatherbulletin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pindaro.weatherbulletin.clients.WeatherClient;
import com.pindaro.weatherbulletin.model.Payload;



@Service
public class WeatherService {
	@Autowired
	WeatherClient client;
	
	public Payload chiamaIlClient() {
		return client.weatherHourly(33.441792,-94.037689);
	}
	
}
