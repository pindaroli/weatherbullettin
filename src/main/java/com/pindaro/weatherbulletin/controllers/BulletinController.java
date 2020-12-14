package com.pindaro.weatherbulletin.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pindaro.weatherbulletin.model.Hourly;
import com.pindaro.weatherbulletin.model.Payload;
import com.pindaro.weatherbulletin.model.WeatherResponse;
import com.pindaro.weatherbulletin.services.WeatherService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api")
@Api(value = "User Resource REST Endpoint", description = "Dà le previstioni per i prossimi due giorni")
public class BulletinController {
	@Autowired
	WeatherService serv;
	

	@GetMapping("/weatherBullettin")
	public WeatherResponse index(@RequestParam(defaultValue="45.464664",name = "lat") String latitudine ,
			@RequestParam(defaultValue = "9.188540",name ="lon") String longitudine ) {
		System.out.println("arg"+latitudine+"----"+longitudine);
		Payload payload=serv.chiamaIlClient(Float.parseFloat(latitudine),Float.parseFloat(longitudine));
		
		Stream<Hourly> s=payload.hourly.stream();
	
		List<Hourly> listFilter = s.filter(
				 (ele)->  {
					 	long ora=(ele.dt/3600)%24;
					 	System.out.println("numero ora:"+ora); 
					 	return (ora >= 9 && ora<=18);
					 }).collect(Collectors.toList());
		 
		 WeatherResponse resp=new WeatherResponse();
		 resp.getLavorativo().setMinTemp(listFilter.stream().map(ele->ele.temp).min(Double::compareTo).get());
		 resp.getLavorativo().setMaxTemp(listFilter.stream().map(ele->ele.temp).max(Double::compareTo).get());
		 resp.getLavorativo().setMaxUmidity(listFilter.stream().map(ele->ele.humidity).max(Long::compareTo).get());
		 resp.getLavorativo().setMinUmidity(listFilter.stream().map(ele->ele.humidity).min(Long::compareTo).get());
		 resp.getLavorativo().setAverageTemp(listFilter.stream().
				 map(ele->ele.temp).reduce(0D, (acc, element) -> acc + element).doubleValue()/listFilter.size());
		 resp.getLavorativo().setAverageUmidity(listFilter.stream().
				 map(ele->ele.humidity).reduce(0L, (acc, element) -> acc + element).longValue()/listFilter.size());
		 
		Stream<Hourly> s2=payload.hourly.stream();
		listFilter = s2.filter(
					 (ele)->  {
						 	long ora=(ele.dt/3600)%24;
						 	System.out.println("numero ora:"+ora); 
						 	return (ora < 9 || ora>18);
						 }).collect(Collectors.toList());
		System.out.println("*******"+listFilter.size());
		resp.getNonLavorativo().setMinTemp(listFilter.stream().map(ele->ele.temp).min(Double::compareTo).get());
		resp.getNonLavorativo().setMaxTemp(listFilter.stream().map(ele->ele.temp).max(Double::compareTo).get());
		 resp.getNonLavorativo().setMaxUmidity(listFilter.stream().map(ele->ele.humidity).max(Long::compareTo).get());
		 resp.getNonLavorativo().setMinUmidity(listFilter.stream().map(ele->ele.humidity).min(Long::compareTo).get());
		 resp.getNonLavorativo().setAverageTemp(listFilter.stream().
				 map(ele->ele.temp).reduce(0D, (acc, element) -> acc + element).doubleValue()/listFilter.size());
		 resp.getNonLavorativo().setAverageUmidity(listFilter.stream().
				 map(ele->ele.humidity).reduce(0L, (acc, element) -> acc + element).longValue()/listFilter.size());
		
		 return resp;
	}
  
}