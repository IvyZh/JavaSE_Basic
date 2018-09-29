package com.ivy.github.day09;

public class SigngleTest {

	public static void main(String[] args) {

		SingletonDemo s1 = SingletonDemo.getInstance();
		
		SingletonDemo s2 = SingletonDemo.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
