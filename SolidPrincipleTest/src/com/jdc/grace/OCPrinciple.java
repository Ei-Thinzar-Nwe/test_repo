package com.jdc.grace;

public class OCPrinciple {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.useStandardKeyboard();
		
		Laptop lap = new Laptop();
		lap.useStandardKeyboard();
		lap.useWirelessKeyboard();
		
	}	
}

class Computer{
	
	void useStandardKeyboard() {
		System.out.println("Standard Keyboard ");
	}
	//after fimishing the project, the client asked to use a new keyboard
	void useWirelessKeyboard() {
		System.out.println("Wirless keyboard");
	}
}

class Laptop extends Computer{
	// after finishing the project, the client asked to use a new keyboard
	// break OCP
	void useWirelessKeyboard() {
		System.out.println("Wirless keyboard ");
	}
}