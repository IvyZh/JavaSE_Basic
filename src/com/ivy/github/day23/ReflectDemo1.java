package com.ivy.github.day23;

import java.util.Date;

public class ReflectDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		//如何创建Class对象?

		//1. 使用class属性
		Class clz1 = Date.class;

		//2. 通过对象getClass方法获取，其中getClass是Object的方法
		Date d1 = new Date();
		Class clz2 = d1.getClass();

		//3. 通过Class的静态方法forName()获取
		Class clz3 = Class.forName("java.util.Date");
		System.out.println(clz1);
		System.out.println(clz2);
		System.out.println(clz3);
	}

}
