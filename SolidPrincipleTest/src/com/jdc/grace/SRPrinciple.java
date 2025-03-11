package com.jdc.grace;

public class SRPrinciple {
 public static void main(String[] args) {
	User user = new User();
	user.setName("John");
	user.saveToDo();
	System.out.println(user.getName());
 	}
 
}


class User {
	
	private String name;
	
	void setName(String name) {
		this.name = name;
		
	}

	String getName() {
		return name;
	}
	
	//should not hv in user
	void saveToDo() {
		System.out.println("Save to to do ");
	}
}