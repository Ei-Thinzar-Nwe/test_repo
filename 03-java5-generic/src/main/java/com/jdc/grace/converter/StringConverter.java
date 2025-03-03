package com.jdc.grace.converter;

public class StringConverter implements Converter<Integer,String>{
	@Override 
	
	public String convert(Integer i) {
		return String.valueOf(i);
	}

}
