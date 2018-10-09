package com.ivy.github.day23;

public class User {

	private String name;
	private int age;

	public User() {

	}

	private User(String name) {
		this.name = name;
	}

	public User(int age) {
		this.age = age;
	}

	private User(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
