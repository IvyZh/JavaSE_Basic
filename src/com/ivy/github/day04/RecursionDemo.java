package com.ivy.github.day04;

//方法的递归操作
//斐波纳契数列，其通项公式为：F（0）=0，F(1)=1，Fn=F(n-1) +F(n-2)（n>=3，n∈N*），现在求F(5)的值，怎么做呢？
//观察：这个数列从第三项开始，每一项都等于前两项之和。
//要求F(5)的值，肯定要先求F(4)和F(3)的值，而求F(4)的值又需要求F(3)和F(2)的值... ...
//解决办法1：
//依次求出F(1)、F(2)、F(3)、F(4)值，再处理。
//这种办法很笨，效率低极低。
//方法fn的作用就是求num数的函数值，而求函数值又需要num-1和num-2的函数值，而这两个函数值的求法和求num一样，那么也就可以使用同一个方法。
public class RecursionDemo {

	public static void main(String[] args) {

		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368
		int result = fn(15);
		System.out.println(result);

	}

	private static int fn(int i) {
		if (i == 0)
			return 0;
		if (i == 1)
			return 1;
		return fn(i - 1) + fn(i - 2);
	}
}
