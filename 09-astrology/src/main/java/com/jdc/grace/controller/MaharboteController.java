package com.jdc.grace.controller;

import static com.jdc.grace.utils.Maharbote.getSign;
import static com.jdc.grace.utils.MyanmarConverter.convert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.jdc.grace.dto.User;

public class MaharboteController {


	public String getResult(User user) {
		return getSign(convert(user.getYear(), user.getMonth(), user.getDay()), user.getDayName());
	}

	public void showResult(String sign) {
		try (BufferedReader br = new BufferedReader(
				new FileReader(
						new File("src/main/resources/maharbotes/"+sign.toLowerCase()+".txt")))) {
			System.out.println(sign);
			
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

