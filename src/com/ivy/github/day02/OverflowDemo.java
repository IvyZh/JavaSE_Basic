package com.ivy.github.day02;

// 数据过大和溢出

//‭0111 1111 1111 1111 1111 1111 1111 1111‬     2147483647
//‭0111 1111 1111 1111 1111 1111 1111 1110     2147483646
//			... ...
//0000 0000 0000 0000 0000 0000 0000 0001     1
//0000 0000 0000 0000 0000 0000 0000 0000     0
//1111 1111 1111 1111 1111 1111 1111 1111    -1
//1111 1111 1111 1111 1111 1111 1111 1110    -2
//			... ...
//1000 0000 0000 0000 0000 0000 0000 0001    -2147483647			
//1000 0000 0000 0000 0000 0000 0000 0000    -2147483648
//‬
//===========================================================
//
//2147483647 + 1 操作：
//
//‭0111 1111 1111 1111 1111 1111 1111 1111‬  
//0000 0000 0000 0000 0000 0000 0000 0001
//----------------------------------------
//1000 0000 0000 0000 0000 0000 0000 0000  负数 -2147483648
//
//
//-2147483648 - 1 操作(加-1)：
//
//1000 0000 0000 0000 0000 0000 0000 0000 
//1111 1111 1111 1111 1111 1111 1111 1111
//----------------------------------------
//0111 1111 1111 1111 1111 1111 1111 1111 负数 -2147483647
//
//===========================================================
//
//+1的原码
//0000 0000 0000 0000 0000 0000 0000 0001
//
//1000 0000 0000 0000 0000 0000 0000 0001 -1的原码 
//1111 1111 1111 1111 1111 1111 1111 1110 -1的反码
//1111 1111 1111 1111 1111 1111 1111 1111 -1的补码
//
//
//+2147483647的原码
//‭0111 1111 1111 1111 1111 1111 1111 1111‬  
//
//1111 1111 1111 1111 1111 1111 1111 1111 -2147483647的原码 
//1000 0000 0000 0000 0000 0000 0000 0000 -2147483647的反码
//1000 0000 0000 0000 0000 0000 0000 0001 -2147483647的补码


public class OverflowDemo {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483648
		
		int i1 = Integer.MAX_VALUE;
		int i2= Integer.MIN_VALUE;
		
		System.out.println("-------");
		System.out.println(i1+1);
		System.out.println(i2-1);

	}

}
