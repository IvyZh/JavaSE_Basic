package com.ivy.github.day10;

//局部内部类(打死都不用):
//在方法中定义的内部类,其可见范围是当前方法和局部变量是同一个级别.
//1):不能使用public,private,protected,static修饰符.
//2):局部内部类只能在当前方法中使用.
//3):局部内部类和实例内部类一样,不能包含静态成员.
//4):局部内部类和实例内部类,可以访问外部类的所有成员.
//5):局部内部类访问的局部变量必须使用final修饰(在Java8中是自动隐式加上final,但是依然是常量,不能改变值).
//   原因:如果当前方法不是main方法,那么当前方法调用完毕之后,当前方法的栈帧被销毁,方法内部的局部变量的空间全部销毁.
//            然后局部内部类是定义在方法中的,而且在方法中会创建局部内部类对象,而局部内部类会去访问局部变量,当当前方法被销毁的时候,对象还在堆内存,依然持有对局部变量的引用,但是方法被销毁的时候局部变量以及被销毁了.
//           此时出现:在堆内存中,一个对象引用着一个不存在的数据. 为了避免该问题,我们使用final修饰局部变量,从而变成常量,永驻内存空间,即使方法销毁之后,该局部变量也在内存中,对象可以继续持有.

public class InnerClassDemo3 {

	static String name = "Outter.class";

	public static void main(String[] args) {
		method1();

		//		new LocalInnerClass();//error,局部内部类只能在当前方法中使用.

	}

	private static void method1() {

		int localVar = 99;//局部变量,局部内部类访问的局部变量必须使用final修饰(在Java8中是自动隐式加上final,但是依然是常量,不能改变值).

		/*private*/ class LocalInnerClass {//不能使用public,private,protected,static修饰符
			private int age = 11;
			//			static int num = 22;//局部内部类和实例内部类一样,不能包含静态成员.

			public int getAge() {
				return age;
			}

			public String getName() {
				return name;//局部内部类和实例内部类,可以访问外部类的所有成员.
			}

			public int getLocalVar() {//局部内部类访问的局部变量必须使用final修饰(在Java8中是自动隐式加上final,但是依然是常量,不能改变值).
				//localVar = 88;//error.

				return localVar;
			}
			//			  原因:如果当前方法不是main方法,那么当前方法调用完毕之后,当前方法的栈帧被销毁,方法内部的局部变量的空间全部销毁.
			//	            然后局部内部类是定义在方法中的,而且在方法中会创建局部内部类对象,而局部内部类会去访问局部变量,当当前方法被销毁的时候,对象还在堆内存,依然持有对局部变量的引用,但是方法被销毁的时候局部变量以及被销毁了.
			//	           此时出现:在堆内存中,一个对象引用着一个不存在的数据. 为了避免该问题,我们使用final修饰局部变量,从而变成常量,永驻内存空间,即使方法销毁之后,该局部变量也在内存中,对象可以继续持有.
	           

		}
		System.out.println("局部内部类中的age：" + new LocalInnerClass().getAge());
		System.out.println("局部内部类中的age：" + new LocalInnerClass().age);
	}

}
