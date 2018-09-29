package com.ivy.github.day08;

//多态的作用：当把不同的子类对象都当作父类类型来看待，可以屏蔽不同子类对象之间的实现差异，从而写出通用的代码达到通用编程，以适应需求的不断变化。
//多态的前提:可以是继承关系(类和类)/也可以是实现关系(接口和实现类),在开发中多态一般都指第二种.
public class PolymorphicDemo {

	public static void main(String[] args) {
		SuperClass clz = new SubClass();//多态
		clz.doWork();//???输出什么结果:Super.doWork...  

		// 反编译上面的代码发现结果如下：
		//		SuperClass.doWork();

	}
}

class SuperClass {
	static public void doWork() {
		System.out.println("Super.doWork...");
	}
}

class SubClass extends SuperClass {
	static public void doWork() {
		System.out.println("SubClass.doWork...");
	}
}