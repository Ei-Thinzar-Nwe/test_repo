package com.jdc.grace.dateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TemporalAccessorTest {
	
	@Test
	void setValueTest() {
		//localDateTime is a grandChild of temporalAccessor
		var ldt = LocalDateTime.from(LocalDateTime.now());
		System.out.println(ldt);
		
		var ldt1 = LocalDateTime.of(2022, 12, 20, 10, 20);
		System.out.println(ldt1);
	}
	
	@Test
	@Disabled
	
	void getValueWithTemporalFieldOrFluentMethod() {
		//ChronoField is a child of TemporalField
		LocalDateTime ldt = LocalDateTime.now();
		int dom = ldt.get(ChronoField.DAY_OF_MONTH);
		int dow = ldt.get(ChronoField.DAY_OF_WEEK);
		int doy = ldt.get(ChronoField.DAY_OF_YEAR);
		
		System.out.println(dow + "\t" + dom + "\t" + doy);
		
		//using fluent method
		int day = ldt.getDayOfMonth();
		int month = ldt.getMonthValue();
		int year = ldt.getYear();
		System.out.println(day + " " +month+ " " + year);
	}

}
