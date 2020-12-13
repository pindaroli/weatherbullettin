package com.pindaro.weatherbulletin.model;

public class WeatherResponse {
 private Stat lavorativo=new Stat();
 private Stat nonLavorativo=new Stat();
 
public Stat getLavorativo() {
	return lavorativo;
}
public void setLavorativo(Stat lavorativo) {
	this.lavorativo = lavorativo;
}
public Stat getNonLavorativo() {
	return nonLavorativo;
}
public void setNonLavorativo(Stat nonLavorativo) {
	this.nonLavorativo = nonLavorativo;
}
 
}
