
package com.pindaro.weatherbulletin.model;

import java.util.List;

import lombok.Getter;
@Getter
public class Payload {

    public double lat;
    public double lon;
    public String timezone;
    public long timezoneOffset;
    public List<Hourly> hourly = null;

}
