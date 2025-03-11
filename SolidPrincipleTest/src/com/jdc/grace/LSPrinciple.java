package com.jdc.grace;

public class LSPrinciple {

	public static void main(String[] args) {
		Flyable  bird = new Bird();
		bird.fly();
		
		//boomb crash
		Flyable penguin = new Penguin();
		penguin.fly();
		
	}
}

interface Flyable{
	void fly();
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("Bird is flying ");
	}
}

// penguin is a bird but it cannot fly
// bread liskob substitution principle
class Penguin implements Flyable {
	public void fly() {
		System.out.println(" Penguin is flying");
	}
}