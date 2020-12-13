package com.pindaro.weatherbulletin.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pindaro.weatherbulletin.model.Payload;






@FeignClient(name="weatherClient", url="https://api.openweathermap.org/data/2.5")
public interface WeatherClient {
	@RequestMapping(method = RequestMethod.GET, 
			value = "/onecall?lat=33.441792&lon=-94.037689&exclude=minutely,daily,current,alerts&appid=adfb08adacb72dd295c1bb481baacbea&unit=metric&lang=it")
	Payload weatherHourly(
	@PathVariable("lat") double lat,
	@PathVariable("lan") double lan);
	
}
