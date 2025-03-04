package com.jdc.grace.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jdc.grace.trycatch.TryCatchData;

import org.junit.jupiter.api.Test;

public class CTryCatchTest {
	
	
	TryCatchData data = new TryCatchData();
	@Test
	void testTryWitchFinally() {
		String res = data.useCheckedWithTryFinally();
		System.out.println(res);
	}
	//@Test 
	void testTryMultiCath() {
		int res1 = data.useUncheckedWithTryMultiCatch(new int[2], "2");
		assertEquals(-1, res1);
		int res2 = data.useUncheckedWithTryMultiCatch(new int[2], "Hello");
		assertEquals(-1,res2);
		
	}
	//@Test
	void testTryCatch() {
		String res1 = data.useUncheckedWithTryCatch(127);
		System.out.println(res1);
		assertEquals(res1,"ClassCastException" );
	}

}
