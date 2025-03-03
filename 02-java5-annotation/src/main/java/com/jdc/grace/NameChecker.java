package com.jdc.grace;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NameChecker {
	
	// no args and must be return
	String value() default "No Name";
	
}
	//int value loh pyaw htar yin pyan khor ll value htae ll ya ma htae ll ya
	
	

