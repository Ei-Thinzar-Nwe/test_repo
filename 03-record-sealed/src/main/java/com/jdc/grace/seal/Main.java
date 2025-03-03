package com.jdc.grace.seal;

public class Main {
	public static void main(String[] args) {
		
	}
}

sealed class School permits Student,Teacher{}

final class Student extends School{}
non-sealed class Teacher extends School{}
// sealed class lok htar yin permit pay 
// extends lok pho so final or non-sealed phyit ma ya ml

sealed interface Cashier permits Employee{}

//record Staff(int id, String name) {}
final class Employee implements Cashier {}

//class Employee extends School{}