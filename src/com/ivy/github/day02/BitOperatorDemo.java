package com.ivy.github.day02;

// 位运算符-移位操作
public class BitOperatorDemo {

	public static void main(String[] args) {

		//		<<：将操作数的二进制码整体左移指定位数，左移之后的空使用“0”来补充。
		//		>>：将操作数的二进制码整体右移指定位数，右移之后的空使用“符号位”来补充：
		//		  若是正数使用“0”补充；
		//		  若是负数使用“1”补充；（操作负数：取反，求补，操作，取反，求补）
		//		>>>：将操作数的二进制码整体右移指定位数，右移之后的空位使用“0”来补充。

		int a1 = 4;
		int a2 = a1 << 2;
		System.out.println(a2);//16
		int b1 = -4;
		int b2 = b1 << 2;
		System.out.println(b2);//-16
		

		int a3 = 16;
		int a4 = a3 >> 3;
		System.out.println(a4);//2
		int b3 = -16;
		int b4 = b3 >> 3;
		System.out.println(b4);//-2

		int a5 = 16;
		int a6 = a5 >>> 3;
		System.out.println(a6);//2
		int b5 = -16;
		int b6 = b5 >>> 3;
		System.out.println(b6);//536870910
		

	}

}
