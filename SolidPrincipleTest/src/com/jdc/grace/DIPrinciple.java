package com.jdc.grace;

public class DIPrinciple {

	public static void main(String[] args) {
		// high level module
		Keyboard standardKeyboard = new WirelessKeyboard();
		standardKeyboard.type();
		
	}
}

class WirelessKeyboard implements Keyboard{
	// low level module
	public void type() {
		System.out.println("Using WirelessKeyboard for typing ");
	}


	public void specialKey() {
		//todo auto-generated method stub
	}
	
	
}

class StandardKeyboard implements Keyboard {
	// low level module
	public void type() {
	System.out.println("Using Standard keyboard for typing");
	}
	
	public void specialKey() {
		// todo auto- generated method stub
	}
}



// dependency inversion principle
interface Keyboard {
	void type();
}
