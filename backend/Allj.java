package com.example.actuatorservice;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalTime;

public class Allj {

	ZoneId timezonej = ZoneId.systemDefault();
	LocalDate Datej = LocalDate.now();
	LocalTime Timej = LocalTime.now();


	public ZoneId getTimezone() {
		return timezonej;
	}

	public LocalDate getDate() {
		return Datej;
	}

	public LocalTime getTime() {
		return Timej;
	}

}