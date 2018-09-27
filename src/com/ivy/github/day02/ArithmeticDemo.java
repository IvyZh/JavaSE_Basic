package com.ivy.github.day02;

//用来处理四则运算的符号
public class ArithmeticDemo {

	public static void main(String[] args) {

		/*		
		 除号：整数在使用除号操作时，得到的结果仍为整数（小数部分忽略），当整数除以0的时候，会引发算术异常。
		 正无穷大(Infinity):当一个正浮点类型数除以0时,或者正整数除以0.0时;
		 负无穷大(-Infinity):当一个负浮点类型数除以0时,或者负整数除以0.0时;
		 NaN(Not a Number):当0.0除以0.0时;*/

		//System.out.println(1 / 0);//java.lang.ArithmeticException: / by zero
		//System.out.println(-1 / 0);//java.lang.ArithmeticException: / by zero
		//System.out.println(0 / 0);//java.lang.ArithmeticException: / by zero

		System.out.println(0 / 0.0);//NaN
		System.out.println(1 / 0.0);//Infinity
		System.out.println(-1 / 0.0);//-Infinity
	}

}
