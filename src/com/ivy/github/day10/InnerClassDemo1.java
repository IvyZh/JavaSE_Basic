package com.ivy.github.day10;

// 实例内部类

//外部类的访问修饰符:要么使用public,要么就缺省.
//内部类看做是外部类的一个成员,好比字段,那么内部类可以使用public/缺省/protected/private修饰.
//还可以是static修饰.
//-------------------------------------
//实例内部类:
//没有使用static修饰内部类,说明内部类属于外部类的对象,不属于外部类本身.
//特点:
//1:创建实例内部类前,必须存在外部类对象,通过外部类对象创建内部类对象(当存在内部类对象时,一定存在外部类对象). 
//      Outter.Inner in = new Outter().new Inner();
//2:实例内部类的实例自动持有外部类的实例的引用,内部类可以直接访问外部类成员.
//3:外部类中不能直接访问内部类的成员,必须通过内部类的实例去访问.
//4:实例内部类中不能定义静态成员,只能定义实例成员.
//5:如果实例内部类和外部类存在同名的字段或方法abc,那么在内部类中:
//  this.abc:表示访问内部类成员.
//  外部类.this.abc:表示访问外部类成员.

public class InnerClassDemo1 {

	public static void main(String[] args) {
		//创建实例内部类前,必须存在外部类对象,通过外部类对象创建内部类对象(当存在内部类对象时,一定存在外部类对象).
		// Outter.Inner in = new Outter().new Inner();
		int ret = new Outer().new Inner().getNum();
		System.out.println(ret);

		Outer.Inner inner = new Outer().new Inner();

		int age = inner.getAge();
		System.out.println(age);

		String name = inner.getName();
		System.out.println(name);
	}

}

class Outer {
	int age = 17;

	String name = "Outer";

	//	public int getNumInner() {
	//		return num;//外部类中不能直接访问内部类的成员,必须通过内部类的实例去访问.
	//	}
	class Inner {
		int num = 22;
		//static int num2 = 33;//实例内部类中不能定义静态成员,只能定义实例成员.
		String name = "Inner";

		public int getNum() {
			return num;
		}

		public int getAge() {
			return age;//实例内部类的实例自动持有外部类的实例的引用,内部类可以直接访问外部类成员
		}

		public String getName() {
			return this.name + "..." + Outer.this.name;
			//			如果实例内部类和外部类存在同名的字段或方法abc,那么在内部类中:
			//				  this.abc:表示访问内部类成员.
			//				  外部类.this.abc:表示访问外部类成员.
		}
	}

}

//对于每个内部类来说:Java编译器会生成独立.class文件.
//成员内部类:外部类名$内部类名字  （包括实例内部类和静态内部类）
//局部内部类:外部类名$数字内部类名称
//匿名内部类:外部类名$数字
