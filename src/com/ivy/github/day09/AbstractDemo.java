package com.ivy.github.day09;

public class AbstractDemo {

	public static void main(String[] args) {
		//Graph g = new Graph();//使用abstract关键字修饰的类,不能创建实例即不能new一个抽象类,即使创建出抽象类对象,调用抽象方法,根本没有方法体
		Circle c = new Circle();
	}

}

//抽象类也是有构造器的，但无法实例化。
//可以不包含抽象方法，若一旦包含，该类必须作为抽象类,抽象类可以包含普通方法(留给子类调用的),抽象类是有构造器的,子类构造器必须先调用父类构造器。
abstract /*final */class Graph {//抽象类不能使用final修饰，因为必须有子类，抽象方法才能得以实现。

	/*	private*/ Graph() {//构造方法不能都定义成私有的，否则不能有子类(创建子类对象前先调用父类构造方法)。
		System.out.println("...Graph构造器...");
	}

	//使用abstract修饰且没有方法体的方法，称为抽象方法。
	//抽象方法修饰符不能是private 和 final以及static
	//抽象方法必须定义在抽象类或接口中
	abstract double getArea();
}

//抽象类是有构造器的,子类构造器必须先调用父类构造器。
class Circle extends Graph {
	Circle() {
		System.out.println("...Circle构造器...");
	}

	@Override
	double getArea() {
		return 0;
	}

}

//　若子类没有实现/覆盖父类所有的抽象方法，那么子类也得作为抽象类(抽象派生类)。
abstract class GraphChild1 extends Graph {

}


//抽象类和普通类的区别:
//	   普通类有的成员(方法,字段,构造器),抽象类都有.
//	   抽象类不能创建对象,抽象类中可以包含抽象方法.
//	   抽象类必须有子类才有意义,才能完成自己的未尽事业的.
	
	
