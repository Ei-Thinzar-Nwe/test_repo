package com.jdc.grace;

import com.jdc.grace.converter.Converter;
import com.jdc.grace.converter.IntegerConverter;
import com.jdc.grace.converter.StringConverter;

public class Main {

	public static void main(String[] args) {
		Data<String> d = new Data<>();
		d.setValue("30");
		String str = d.getValue();		
		System.out.println(str);
		
		//use generic method
		Data.doSomething("Hello");
		
		Converter<String, Integer> cInt = new IntegerConverter();
		int a =  cInt.convert("50");
		System.out.println(a);
		
		Converter<Integer, String> cString = new StringConverter();
		String s = cString.convert(50);
		System.out.println(s);
		
	}
	
	
}