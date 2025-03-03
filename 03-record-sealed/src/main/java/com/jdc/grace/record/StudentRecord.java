package com.jdc.grace.record;

public record StudentRecord (
		int id,
		String name,
		int age
		) {
	
	/*// canonical constructor
	public StudentRecord(int id,String name,int age ) {
		this.id = id;
		this.name = name;
		this.age = age;
	} */
	
	//compact constructor
	public StudentRecord{
		if(id < 0) {
			throw new IllegalArgumentException();
		}
		if (null == name ) {
			throw new NullPointerException();
		}
		if (age<= 0) {
			throw new IllegalArgumentException();
		}
	}
	
	// secondary constructor
	public StudentRecord(String name) {
		this(1,name,20);
	}
}

