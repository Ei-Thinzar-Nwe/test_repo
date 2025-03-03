package com.jdc.grace.test;

import org.junit.jupiter.api.Test;

import com.jdc.grace.handler.Handler;

public class HandlerTest {
	
	Handler handler = new Handler();

		//@Test
		void testName() {
			Handler handle = new Handler();
			handle.useName();
		}
		
		//@Test 
		void testRecursive() {
			handler.recursive();
		}
		
		@Test
		void testAge() {
			handler.useAge();
		}
	}
			
			
	