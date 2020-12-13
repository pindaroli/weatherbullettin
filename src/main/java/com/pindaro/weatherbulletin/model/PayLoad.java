
package com.pindaro.weatherbulletin.model;

import java.util.List;

public class Payload {

    public double lat;
    public double lon;
    public String timezone;
    public long timezoneOffset;
    public List<Hourly> hourly = null;
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public long getTimezoneOffset() {
		return timezoneOffset;
	}
	public void setTimezoneOffset(long timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}
	public List<Hourly> getHourly() {
		return hourly;
	}
	public void setHourly(List<Hourly> hourly) {
		this.hourly = hourly;
	}

}
