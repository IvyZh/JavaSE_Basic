package com.ivy.github.day08;

/**
 * 模拟的一个功能类，搭配CombinationDemo使用
 *
 */
public class FunctionUtils {

	public FunctionUtils() {
		System.out.println("无参数构造器");
	}

	public FunctionUtils(String name) {
		System.out.println(name + " 带参数构造器");
	}

	public void method1() {
		System.out.println("FunctionUtils...method1");
	}
}
