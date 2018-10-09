package com.ivy.github.day23;

public class Person {

	private String name;
	private int age;

	public Person() {
		System.out.println("无参数构造器");
	}

	private Person(String name, int age) {
		System.out.println("带两个参数构造器");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void doWork() {
		System.out.println("...work()...");
	}

	private void doWork(String p1, String p2) {
		System.out.println("...private work(String String)..." + p1 + "," + p2 + ",name&age：" + name + "_" + age);
	}

	public void doWork(int a) {
		System.out.println("...work(int)..." + a);
	}

	public static void say() {
		System.out.println("...static say()...");
	}

	public int sum(int... arr) {

		System.out.println("sum方法被 调用：" + arr);
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	public void sum2(String... arr) {
		System.out.println("sum2方法被 调用：" + arr);

	}

}
