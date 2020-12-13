package com.pindaro.weatherbulletin.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Stat {
	private Double maxTemp;
	private Double minTemp;
	private Long minUmidity;
	private Long maxUmidity;
	private Long averageUmidity;
	private Double averageTemp;
}
