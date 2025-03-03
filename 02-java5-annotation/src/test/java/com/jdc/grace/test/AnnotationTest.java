package com.jdc.grace.test;

import org.junit.jupiter.api.Test;

import com.jdc.grace.Grade;
import com.jdc.grace.Student;

public class AnnotationTest {

	@Test
	void testName() throws NoSuchFieldException, NoSuchMethodException, SecurityException {
		Student stu = new Student("Andrew", 22);
		
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		
		for(Grade g : stu.getGrade()) {
			System.out.println(g);
		}
	}
}
