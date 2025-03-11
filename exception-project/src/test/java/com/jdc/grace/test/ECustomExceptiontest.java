package com.jdc.grace.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.grace.custom.CustomExceptionData;
import com.jdc.grace.custom.MyCheckException;
import com.jdc.grace.custom.MyUnCheckException;

public class ECustomExceptiontest {

	static CustomExceptionData data;
	
	@BeforeAll
	static void init() {
		data = new CustomExceptionData();
	}
	
	@Test
	void testExcetpion() {		
		assertThrows(MyUnCheckException.class,() -> data.getMyUnCheckException(""));
		assertThrows(MyUnCheckException.class,() -> data.changeCheckToUncheck(null));
		assertThrows(MyCheckException.class,() -> data.getMyCheckException(" "));
	
	}
	
	
	
	
	
	
	
}