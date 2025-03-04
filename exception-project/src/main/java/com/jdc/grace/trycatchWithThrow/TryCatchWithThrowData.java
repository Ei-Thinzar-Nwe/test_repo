package com.jdc.grace.trycatchWithThrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class TryCatchWithThrowData {
	
	public void useMessage() {
		try {
			String message = getData();
						
			System.out.println(checkMessage(message));
			
		}catch (IOException e) {
			System.err.println(e.getMessage());
			
		}catch(NoSuchElementException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/*private String othercheck(String message) {
		String mes = checkMessage(message);
		return mes;
	
*/
	
	//when create check type , must be throws that type
	//when create uncheck type , it's all up to you
	// when u used throws ,iy must be same type or super type
	private String checkMessage(String message) throws NullPointerException {
		
		if(message.isBlank()) {
			throw new NullPointerException ("There is no message !");
		}
		return message;
	}
	
	private String getData() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type your mesaage !!");
		return br.readLine();
	}
}
