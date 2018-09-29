package com.ivy.github.day09;

//单例设计模式(singleton):最常用,最简单的设计模式.单例的编写有N种写法.
//目的：保证某一个在整个应用中某一个类有且只有一个实例(一个类在堆内存只存在一个对象)，即所有指向该类型实例的引用都指向同一块内存空间。  
//写单例模式的步骤：单讲饿汉式.
//      1):必须在该类中,自己先创建出一个对象.
//      2):私有化自身的构造器,防止外界通过构造器创建新的对象.
//      3):想外暴露一个公共的静态方法用于获取自身的对象.

public class SingletonDemo {

	private SingletonDemo() {
	}

	private static final SingletonDemo instance = new SingletonDemo();

	public static SingletonDemo getInstance() {
		return instance;
	}

	public void method1() {
		System.out.println("method1...");
	}
}
