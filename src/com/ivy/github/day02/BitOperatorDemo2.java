package com.ivy.github.day02;

// 位运算符
public class BitOperatorDemo2 {

	public static void main(String[] args) {

		//若要交换两个变量的值，如int a = 3，int b = 5，交换后a 等于5，b等于3，
		//我们可以定义第三方的变量来完成。现在要求使用最快的方式完成，怎么做？

		//  交换两个变量的值

		method1();

		method2();

		method3();
	}

	/**
	 * 此算法能够实现是由异或运算的特点决定的，通过异或运算能够使数据中的某些位翻转，其他位不变。这就意味着任意一个数与任意一个给定的值连续异或两次，值不变。
	 */
	private static void method3() {
		int a = 3;
		int b = 5;
		System.out.println("a = " + a + " ,b = " + b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a = " + a + " ,b = " + b);
	}

	/**
	 * 它的原理是：把a、b看做数轴上的点，围绕两点间的距离来进行计算。
	具体过程：第一句“a=b-a”求出ab两点的距离，并且将其保存在a中；第二句“b=b-a”求出a到原点的距离（b到原点的距离与ab两点距离之差），并且将其保存在b中；第三句“a=b+a”求出b到原点的距离（a到原点距离与ab两点距离之和），并且将其保存在a中。完成交换。
	此算法与标准算法相比，多了三个计算的过程，但是没有借助临时变量。（以下称为算术算法）
	缺点：是只能用于数字类型，字符串之类的就不可以了。a+b有可能溢出(超出int的范围)，溢出是相对的， +了溢出了，-回来不就好了，所以溢出不溢出没关系，就是不安全。
	 */
	private static void method2() {
		int a = 3;
		int b = 5;
		System.out.println("a = " + a + " ,b = " + b);

		a = b - a;
		b = b - a;
		a = b + a;
		System.out.println("a = " + a + " ,b = " + b);
	}

	/**
	 * 这种算法易于理解，特别适合帮助初学者了解计算机程序的特点，是赋值语句的经典应用。
	 * 在实际软件开发当中，此算法简单明了，不会产生歧义，便于程序员之间的交流，
	 * 一般情况下碰到交换变量值的问题，都应采用此算法（以下称为标准算法）。
	* 上面的算法最大的缺点就是需要借助一个临时变量。那么不借助临时变量可以实现交换吗？
	 */
	private static void method1() {
		int a = 3;
		int b = 5;
		System.out.println("a = " + a + " ,b = " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("a = " + a + " ,b = " + b);

	}

}
