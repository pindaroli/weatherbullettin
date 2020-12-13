package com.pindaro.weatherbulletin.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WeatherResponse {
 private Stat lavorativo=new Stat();
 private Stat nonLavorativo=new Stat();
 
}
