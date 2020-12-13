
package com.pindaro.weatherbulletin.model;

import java.util.List;


public class Hourly {

    public long dt;
    public double temp;
    public double feelsLike;
    public long pressure;
    public long humidity;
    public double dewPoint;
    public long uvi;
    public long clouds;
    public long visibility;
    public double windSpeed;
    public long windDeg;
    public List<Weather> weather = null;
    public long pop;
    public Rain rain;
	public long getDt() {
		return dt;
	}
	public void setDt(long dt) {
		this.dt = dt;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getFeelsLike() {
		return feelsLike;
	}
	public void setFeelsLike(double feelsLike) {
		this.feelsLike = feelsLike;
	}
	public long getPressure() {
		return pressure;
	}
	public void setPressure(long pressure) {
		this.pressure = pressure;
	}
	public long getHumidity() {
		return humidity;
	}
	public void setHumidity(long humidity) {
		this.humidity = humidity;
	}
	public double getDewPoint() {
		return dewPoint;
	}
	public void setDewPoint(double dewPoint) {
		this.dewPoint = dewPoint;
	}
	public long getUvi() {
		return uvi;
	}
	public void setUvi(long uvi) {
		this.uvi = uvi;
	}
	public long getClouds() {
		return clouds;
	}
	public void setClouds(long clouds) {
		this.clouds = clouds;
	}
	public long getVisibility() {
		return visibility;
	}
	public void setVisibility(long visibility) {
		this.visibility = visibility;
	}
	public double getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}
	public long getWindDeg() {
		return windDeg;
	}
	public void setWindDeg(long windDeg) {
		this.windDeg = windDeg;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public long getPop() {
		return pop;
	}
	public void setPop(long pop) {
		this.pop = pop;
	}
	public Rain getRain() {
		return rain;
	}
	public void setRain(Rain rain) {
		this.rain = rain;
	}

}
