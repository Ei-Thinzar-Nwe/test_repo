package com.jdc.grace.custom;

public class CustomExceptionData {
	
	
	public String changeCheckToUncheck(String message) throws MyUnCheckException {
		try {
			String mess = getMyCheckException(message);
			System.out.println(mess);
			
		} catch (MyCheckException e) {
			System.err.println(e.getMessage());
			throw new MyUnCheckException(e.getMessage());
		}
		return message;
	}

	public String getMyCheckException(String message) throws MyCheckException {
		if (null == message || message.isBlank()) {
			throw new MyCheckException("There is no message yet for check !");
		}
		return message;
	}

	public String getMyUnCheckException(String message) throws MyUnCheckException {
		if (null == message || message.isBlank()) {
			throw new MyUnCheckException("There is no message yet for uncheck!");
		}
		return message;
	}

	
}