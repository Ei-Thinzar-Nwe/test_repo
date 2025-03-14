package com.jdc.grace.dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TemporalAmountTest {
	
	@Test
	void useBetweenWithPeriodAndDuration() {
		var p = Period.between(LocalDate.now(), LocalDate.of(2025, 04, 13));
		System.out.println(p.getMonths()+"\t"+p.getDays());
		
		var d = Duration.between(LocalTime.now(), LocalTime.of(9, 30));
		System.out.println(d.get(ChronoUnit.SECONDS)/60);
		System.out.println(d.toMinutes());
		
		/*
		 * var d= Duration.between(LocalTime.of(
		 */
	}
	
	@Test
	@Disabled
	void durationTest() {
		var d1 = Duration.ofDays(10);
		System.out.println(d1);
	
		var lt = d1.addTo(LocalTime.now());
		System.out.println(lt);
	}

	@Test
	@Disabled
	void periodTest() {
		var p1 = Period.of(2011, 1, 10);
		System.out.println(p1);
		var ld = p1.addTo(LocalDate.now());
		System.out.println(ld);
	}
	
	
}
