package com.jdc.grace.collection;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class EMapDataTest  extends Junitconfig{
	
	private Map<K, V> <Integer, String> map;
	
	@BeforeEach
	void addData() {
		map.put(3, "John");
		map.put(5, "William");
		map.put(1, "Jackson");
		map.put(3, "Oliver");
		map.put(2, "John");
		map.put(4, "orgus");
		map.put(6, "Andrew");
		
		
		
	}

	@Test
	@Order(1)
	void useHashMapTest() {
		map = data.useMap("hash");
		
		for(Entry <Integer, String> e: Map.entry()) {
			System.out.println();
		}
			
		
	}
	
	
}
