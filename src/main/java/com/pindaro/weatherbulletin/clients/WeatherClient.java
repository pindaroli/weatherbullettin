package com.pindaro.weatherbulletin.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pindaro.weatherbulletin.model.PayLoad;






@FeignClient(name="weatherClient", url="pro.openweathermap.org/data/2.5")
public interface WeatherClient {
	@RequestMapping(method = RequestMethod.GET, value = "forecast/hourly?q={queryString}&appid=adfb08adacb72dd295c1bb481baacbea")
	PayLoad weatherHourly(
	@PathVariable("queryString") String queryString);
	
}
