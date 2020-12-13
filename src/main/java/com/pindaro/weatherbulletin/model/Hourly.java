
package com.pindaro.weatherbulletin.model;

import java.util.List;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
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

}
