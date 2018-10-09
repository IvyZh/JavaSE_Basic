
package com.ivy.github.day09;

//包装类中的缓存设计(享元模式 FlyWeight),本质就是缓存设计:
//Byte、Short、Integer、Long：缓存[-128，127]区间的数据；
//Character：缓存[0，127]区间的数据；

public class FlyWeightDemo {

	public static void main(String[] args) {

		method1();
		System.out.println("-------");
		method2();
		System.out.println("-------");
		method3();

	}

	private static void method3() {
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		Integer i3 = 127;
		Integer i4 = Integer.valueOf(127);
		System.out.println(i1 == i2);//false
		System.out.println(i2 == i3);//false
		System.out.println(i1 == i3);//false
		System.out.println(i4 == i3);//true

	}

	private static void method1() {

		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(i1 == i2);//false
		System.out.println(i2 == i3);//false
		System.out.println(i1 == i3);//false
		System.out.println(i4 == i3);//true

	}

	private static void method2() {
		Integer i1 = new Integer(128);
		Integer i2 = new Integer(128);
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i1 == i2);//false
		System.out.println(i2 == i3);//false
		System.out.println(i1 == i3);//false
		System.out.println(i4 == i3);//false

	}

	// 下面两个方法可以共存，说明int和Integer不是相同的数据类型

	public void add(int a) {

	}

	public void add(Integer a) {

	}
}
