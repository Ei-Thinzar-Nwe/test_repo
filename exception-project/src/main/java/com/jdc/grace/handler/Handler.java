package com.jdc.grace.handler;

public class Handler {

	private Person person;
	private int count = 1 ;
	public Handler() {
		super();
		person = new Person();
		
	}
	
	public void useName() {
		try {
			person.setName("John Doe");
			System.out.println(person.getName());
			
		}catch (NullPointerException e) {
			System.out.println("This is NullPointerException because there is no person object");
		}
		
	}
	// null pointer exception when person object is not create yet
	public void useAge() {
		try {
			person.setAge(20);
			int age = dividedByZero(person.getAge());
			System.out.println(age);
				} catch (ArithmeticException e) {
					System.out.println("This is ArithmeticException because any number ");
				}
		
	}
	
	//stack over flow error
	public void recursive() {
		try {
			if (count > 0) {
				System.out.println("recursive :" + count);
				count ++;
				recursive();
			} 
		} catch (StackOverflowError e) {
			System.out.println("this is StackOverFlowError cause of recursive");
		}
		
	}
	
	//arthimetic expection
	private int dividedByZero(int age) {
		return age/0 ;
	}
}