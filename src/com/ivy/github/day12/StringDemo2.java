package com.ivy.github.day12;

public class StringDemo2 {

	public static void main(String[] args) {

		String s1 = "ABCD";
		String s2 = "A" + "B" + "C" + "D";
		String s3 = "AB" + "CD";
		String s4 = new String("ABCD");
		String temp = "AB";
		String s5 = temp + "CD";
		String s6 = getStr() + "CD";

		System.out.println(s1 == s2);//t
		System.out.println(s1 == s3);//t
		System.out.println(s1 == s4);//f
		System.out.println(s1 == s5);//f
		System.out.println(s1 == s6);//f

		//		使用只包含直接量的字符串连接符如"aa" + "bb"创建的也是直接量编译期就能确定,已经确定存储到常量池中(str2和str3)；
		//		使用包含String直接量(无final修饰符)的字符串表达式(如"aa" + s1)创建的对象是运行期才创建的,存储在堆中；
		//		通过变量/调用方法去连接字符串,都只能在运行时期才能确定变量的值和方法的返回值,不存在编译优化操作.

	}

	private static String getStr() {
		return "AB";
	}
}
