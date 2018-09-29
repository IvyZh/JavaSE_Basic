package com.ivy.github.day06;

public class ServantDemo {

	public static void main(String[] args) {
		Servant s = new Servant();
		s.age = 18;
		s.name = "Lucy";

		s.cook();
		s.work();
		System.out.println(s);

	}

}

class Servant {
	int age;
	String name;

	void work() {
		System.out.println("work...");
	}

	void cook() {
		System.out.println("cook...");
	}
}