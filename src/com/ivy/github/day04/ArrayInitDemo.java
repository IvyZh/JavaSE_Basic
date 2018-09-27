package com.ivy.github.day04;

public class ArrayInitDemo {

	public static void main(String[] args) {
		int[] arr1 = new int[5];//ok,动态初始化
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };//ok，静态初始化
		int[] arr4 = { 1, 2, 3, 4, 5, 6 };//ok，静态初始化的简写
		//int[] arr3 = new int[5] { 1, 2, 3, 4, 5, 6, 7, 8 };//error ，动静态结合不行，编译失败

		int[] arr5;
		arr5 = new int[] { 1, 2, 3, 4 };//ok，这种方式，可以先声明，再初始化

		int[] arr6;
		//arr6={1,2,3,4};//error 编译失败

		//注意直接打印char[] 类型是可以获得里面的数据的，int[]这种是打印地址的

		char[] ch1 = { 'L', 'O', 'V', 'E' };
		System.out.println(ch1);//LOVE
		System.out.println(ch1.length);//4

		int[] array = { 5, 2, 0 };
		System.out.println(array);//[I@7852e922

	}

}
