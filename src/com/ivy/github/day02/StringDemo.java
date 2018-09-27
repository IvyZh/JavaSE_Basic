package com.ivy.github.day02;

//字符串拼接:字符串和任意数据类型相连接,结果都是字符串类型.
public class StringDemo {

	public static void main(String[] args) {

		System.out.println(8 + 7 + "Hello");//结果是
		System.out.println("Hello" + 7 + 8);//结果是
		System.out.println(7 + "Hello" + 8);//结果是
		String str = 17 + "ABC";//组成一个新的字符串
		System.out.println(str);
		// String str2 = (String)17 + "ABC";//编译错误: 不可转换的类型
		System.out.println("\"Hello\"");//转义字符
	}

}
