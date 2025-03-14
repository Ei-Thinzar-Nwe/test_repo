package com.jdc.grace.maharbote;


import org.junit.jupiter.api.Test;

import com.jdc.grace.controller.MaharboteController;
import com.jdc.grace.dto.User;

public class MaharboteTest {

	@Test
	void test() {
		User user = new User("Andrew", 1983, 01, 06, 5);
		MaharboteController controller = new MaharboteController();
		String sign = controller.getResult(user);
		controller.showResult(sign);
	}
}