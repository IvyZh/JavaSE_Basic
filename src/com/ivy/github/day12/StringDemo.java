package com.ivy.github.day12;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "ABC";
		String s2 = "ABC";
		System.out.println(s1 == s2);//true

		String s3 = "DEF";
		String s4 = new String("DEF");
		String s5 = new String("DEF");
		System.out.println(s3 == s4);//false
		System.out.println(s4 == s5);//false
		// 面试题1

		String str1 = "abcd";
		String str2 = new String("abcd");
		System.out.println(str1 == str2);//false
		System.out.println(str1.equals(str2));//true

		//		 String   str1  =  “ABCD”;     最多创建一个String对象,最少不创建String对象.   
		//		如果常量池中,以及存在”ABCD”,那么str1直接引用,此时不创建String对象.   
		//		否则,先在常量池先创建”ABCD”内存空间,再引用.
		//		  String   str2  =  new String(“ABCD”); 
		//		最多创建两个String对象,至少创建一个String对象.  n
		//		ew关键字:绝对会在堆空间,创建内存区域.  所以至少创建一个String个对象.
	}
}
