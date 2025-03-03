package com.jdc.grace.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.grace.check.CheckExceptionData;

public class CheckExceptionTest {
	
	CheckExceptionData data = new CheckExceptionData();
	
	@Test
	void fileTest() {
		String res = data.createFile("");
		assertEquals(res, "exit");
		
		String res1 = data.createFile("D:/data");
		assertEquals(res1, "IOException");
	}
	
}
