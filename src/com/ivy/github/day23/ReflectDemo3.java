package com.ivy.github.day23;

import java.lang.reflect.Constructor;

//需求:通过反射来获取某一个类的构造器:
//1):获取该类的字节码对象.
//2):从该字节码对象中去找需要获取的构造器.

public class ReflectDemo3 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class userClase = User.class;
		Constructor<?>[] constructors = userClase.getConstructors();//该方法只能获取当前Class所表示类的public修饰的构造器
		for (Constructor c : constructors) {
			System.out.println(c);//public com.ivy.github.day23.User()
		}

		constructors = userClase.getDeclaredConstructors();//获取当前Class所表示类的所有的构造器,和访问权限无关
		for (Constructor c : constructors) {
			System.out.println(c);
			//public com.ivy.github.day23.User()
			//private com.ivy.github.day23.User(java.lang.String)
		}

		Constructor c = userClase.getConstructor(int.class);//获取当前Class所表示类中指定的一个public的构造器
		System.out.println(c);//public com.ivy.github.day23.User(int)

		//c = userClase.getConstructor(int.class, String.class);//Exception in thread "main" java.lang.NoSuchMethodException: com.ivy.github.day23.User.<init>(int, java.lang.String)

		c = userClase.getDeclaredConstructor(int.class, String.class);//private com.ivy.github.day23.User(int,java.lang.String)
		System.out.println(c);

	}

}
