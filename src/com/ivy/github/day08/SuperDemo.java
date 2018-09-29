package com.ivy.github.day08;

//必须现有父类对象,而后才能有子类对象.

//必须先调用父类构造器,而后再调用子类构造器.

//子类初始化过程:创建子类对象的过程.
//在创建子类对象之前,会先创建父类对象.
//调用子类构造器之前,在子类构造器中会先调用父类的构造器,
//默认调用的是父类无参数构造器..
//1): 如果父类不存在可以被子类访问的构造器,则不能存在子类.
//2):如果父类没有提供无参数构造器,此时子类必须显示通过super语句去调用父类带参数的构造器.



//super关键字的使用场景:
//	 1):可以使用super解决子类隐藏了父类的字段情况.该情况,我们一般不讨论,因为破坏封装.
//	 2):在子类方法中,调用父类被覆盖的方法,引出super的例子,此时必须使用super.
//	 3):在子类构造器中,调用父类构造器,此时必须使用super语句:super([实参]).


public class SuperDemo {
	

	public static void main(String[] args) {

		Penguin p = new Penguin();
		p.say();
	}
}

class Bird {
	private String name = "小鸟";

	public Bird() {
		System.out.println("Bird 无参数 构造器  ");
	}

	public Bird(String name) {
		this.name = name;
		System.out.println("Bird 带参数 构造器 " + name);
	}

	public void say() {
		System.out.println(name + "...bird...say");
	}
}

class Penguin extends Bird {

	// 如果注释了父类Bird的无参数构造器，同时添加了带参数的构造器，则编译失败；
	// 如果只是注释了Bird的午餐构造器，不添加其他构造器，则会调用父类默认的无参数构造器，不会报错。
	public Penguin() {
		System.out.println("Penguin 无参数 构造器");
	}

	public void say() {
		super.say();
		System.out.println("...Penguin...say");
		super.say();
	}
}