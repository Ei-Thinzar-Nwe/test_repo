package com.jdc.grace.collection;

public record Person(String name,int age)implements Comparable<Person> {
	
	@Override
	public int compareTo(Person p) {
		return p.name.compareTo(name);
	}

}
