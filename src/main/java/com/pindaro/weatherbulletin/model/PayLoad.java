package com.pindaro.weatherbulletin.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter 
@Setter
public class PayLoad {

		   String cod;
		   double message;
		   long cnt;
		   List<Data> list;
		   City city;
		   String country;
		   int timezone;
		   double sunrise; //1568958164,
		   double sunset; // 1569002733
}
