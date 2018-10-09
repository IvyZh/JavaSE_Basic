package com.ivy.github.day23;

import java.util.Date;

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {
		//		九大内置Class实例:  JVM中预先提供好的Class实例,分别:byte,short,int,long,float,double,boolea,char,void.
		//		        表示:byte.class,short.class,int.class,....void.class.
		//在8大基本数据类型的包装类中,都有一个常量:TYPE,用于返回该包装类对应基本类的字节码对象.
		//System.out.println(Integer.TYPE == int.class);//true
		//注意:Integer和int是不同的数据类型
		//System.out.println(Integer.class == int.class);//false

		System.out.println(int.class == Integer.TYPE);//t
		System.out.println(Integer.TYPE);//int
		System.out.println(int.class == Integer.class);//f

		//如何来表示数组的Class实例

		int[] arr = { 1, 2, 3, 4 };

		Class intclz1 = int[].class;
		Class intclz2 = arr.getClass();
		System.out.println(intclz1);//class [I
		System.out.println(intclz2);//class [I
		System.out.println(intclz1 == intclz2);//true
	}

}
