package com.jdc.grace.custom;
	
	@SuppressWarnings("serial")
	public class MyCheckException extends Exception{
		
		public MyCheckException() {
			super();
		}
		
		public MyCheckException(String message) {
			super(message);
		}
	}
