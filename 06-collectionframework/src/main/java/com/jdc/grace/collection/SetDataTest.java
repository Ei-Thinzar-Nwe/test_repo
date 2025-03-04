package com.jdc.grace.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetDataTest {

static CollectionData data;
	
	@BeforeAll
	static void init() {
		data = new CollectionData();
	}
	@Test
	
	void LinkHashTest() {
		HashSet<String> set = new HashSet<String>();
		set.add("Andrew");
		set.add("William");
		set.add("Andrew");
		set.add("John");
		set.add("Henery");
		set.add("Andrew");

		
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"A","L"})
	void useListTest(String str) {
		
		for(String s: data.useList(str.toUpperCase())) {
			System.out.println("Elemnt : " +s);
		}
		
	}

}


