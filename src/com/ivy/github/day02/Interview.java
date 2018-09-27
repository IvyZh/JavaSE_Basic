package com.ivy.github.day02;

// 面试题目汇总
public class Interview {

	public static void main(String[] args) {
		ques1();
		ques2();
	}

	private static void ques2() {
		short s1 = 5;
		//s1 = 3 + s1;//编译报错，需要强转  s = (short)(s + 3);
		s1 += 3;//编译ok，隐式转换

	}

	private static void ques1() {

		int num1 = 1;
		num1 = num1++;
		System.out.println(num1);//1

		int num2 = 1;
		num2 = ++num2;
		System.out.println(num2);//2
	}

}
