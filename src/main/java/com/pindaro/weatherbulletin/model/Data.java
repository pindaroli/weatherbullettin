package com.pindaro.weatherbulletin.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter 
@Setter
public class Data {
	long  dt; //Time of data forecasted, Unix, UTC
    Main main;
    List<Weather> weather;
    Cloud clouds;
    Wind wind;
    Sys sys;
    String dt_txt;
    
}
