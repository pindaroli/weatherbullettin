package com.pindaro.weatherbulletin.model;



public class Stat {
	private Double maxTemp;
	private Double minTemp;
	private Long minUmidity;
	private Long maxUmidity;
	private Long averageUmidity;
	private Double averageTemp;
	public Double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(Double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public Double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(Double minTemp) {
		this.minTemp = minTemp;
	}
	public Long getMinUmidity() {
		return minUmidity;
	}
	public void setMinUmidity(Long minUmidity) {
		this.minUmidity = minUmidity;
	}
	public Long getMaxUmidity() {
		return maxUmidity;
	}
	public void setMaxUmidity(Long maxUmidity) {
		this.maxUmidity = maxUmidity;
	}
	public Long getAverageUmidity() {
		return averageUmidity;
	}
	public void setAverageUmidity(Long averageUmidity) {
		this.averageUmidity = averageUmidity;
	}
	public Double getAverageTemp() {
		return averageTemp;
	}
	public void setAverageTemp(Double averageTemp) {
		this.averageTemp = averageTemp;
	}
}
