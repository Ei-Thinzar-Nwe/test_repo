package com.jdc.grace.trycatch;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class TryCatchData {
	
	public String useCheckedWithTryFinally() {
		String str = null;
		int res= 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Type message !");
			str =   br.readLine();
			res = Integer.parseInt(str);
			br.close();
			
		}catch (Exception e) {
			str =  "IOException";
			
		}finally {
			str = str+ "with change the number of : "+ res;
		}
		return str;
	}
	public int useUncheckedWithTryMultiCatch(int [] array, String index) {
		try {
			int i = Integer.parseInt(index);
			return array[i];
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			return -1;
			}
		
	}
	
	
	public String useUncheckedWithTryCatch(Integer num) {
		try {
			int i = num / 0;
			
			Object b =  num;
			//int byZero = b/0;
			return String.valueOf(b);
			
		} catch (ClassCastException e) {
			return "ClassCastException";
			
		}catch(RuntimeException e) {
			return "ArithmeticException";
		}
	}

}
