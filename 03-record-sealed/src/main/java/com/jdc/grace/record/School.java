package com.jdc.grace.record;

public record School (
	int id,
	String major) {
	
	public int getId() {
		return id();
	}
	
	public String getMajor() {
		return major;
		
	}

}
