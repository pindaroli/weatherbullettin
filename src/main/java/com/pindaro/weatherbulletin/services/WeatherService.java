package com.pindaro.weatherbulletin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pindaro.weatherbulletin.clients.WeatherClient;
import com.pindaro.weatherbulletin.model.Payload;



@Service
public class WeatherService {
	@Autowired
	WeatherClient client;
	
	public Payload chiamaIlClient(float lat, float lon) {
		return client.weatherHourly(lat,lon);
	}
	
}
