package com.pindaro.weatherbulletin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WeatherResponse {
 private Stat lavorativo=new Stat();
 private Stat nonLavorativo=new Stat();
 
}
