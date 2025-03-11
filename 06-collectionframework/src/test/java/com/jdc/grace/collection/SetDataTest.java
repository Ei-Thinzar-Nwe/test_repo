package com.jdc.grace.collection;

import java.util.TreeSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetDataTest extends JunitConfig{

	static TreeData tree;
	
	
	@Test
	void treeSetTest() {
		TreeSet<Person> set = tree.useTreeset();
		for(Person p :set) {
			System.out.println(p.name()+"\t"+p.age());
		}
	}
	
	@ParameterizedTest
	@CsvSource({"0,Andrew","3,Henery"})
	void selectListTest(int index,String res) {
		
	}
	
	@Disabled
	@ParameterizedTest
	@ValueSource(strings = {"h","L","t"})
	void useListTest(String str) {
		System.out.println("Use Set Type : "+str);
		for(String s:data.useSet(str.toUpperCase())) {
			System.out.println("Element : "+s);
		}
		System.out.println();
	}
}