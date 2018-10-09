package com.ivy.github.day09;

//面试题-代码执行顺序

//我的答案：
//...SuperClass构造器...
//1
//...SubClass构造器...
//2
//3
//4
//Hello


// 正确答案：
//1
//...SuperClass构造器...
//...SubClass构造器...
//2
//3
//4
//Hello
public class App {
	private static App d = new App();
	private SubClass t = new SubClass();

	static {
		System.out.println(3);
	}

	public App() {
		System.out.println(4);
	}

	public static void main(String[] args) {
		System.out.println("Hello");
	}
}

class SuperClass {
	public SuperClass() {
		System.out.println("...SuperClass构造器...");
	}
}

class SubClass extends SuperClass {
	static {
		System.out.println(1);
	}

	public SubClass() {
		System.out.println("...SubClass构造器...");
		System.out.println(2);
	}
}