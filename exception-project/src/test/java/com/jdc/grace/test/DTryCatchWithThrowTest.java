package com.jdc.grace.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class DTryCatchWithThrowTest {

	private static DTryCatchWithThrowTest data;
	
	@BeforeAll
	static void init() {
		data = new DTryCatchWithThrowTest();
	}
	
	@Test
	void testUseMessage() {
		data.testUseMessage();
	}
}
