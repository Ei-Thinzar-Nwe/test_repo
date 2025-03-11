package com.jdc.grace.collection;

import java.util.Queue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CQueueAndDequeueDataTest extends JunitConfig {
	

	@Test
	void quequTest() {
		Queue<String> q1 = data.useQueue("block" , 3);
		q1.addAll(List.of ("Andrew" , "John"));
		q1.add("William");
		q1.add("James");
		assertThrows(IllegalStateException.class,() -> q1.add ("James"));
	}
}
