package com.ivy.github.day04;

// 数组练习
public class ArrayDemo {

	public static void main(String[] args) {

		test01();//获取数组最大
		test02();//按格式打印数组元素
		test03();//逆序排列数组元素
		test04();//元素出现索引(线性搜索)

		test05();//java5新特性
		test06();//实现int类型数组元素拷贝
	}

	/*数组拷贝:
		从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
		从 src 引用的源数组到 dest 引用的目标数组，数组组件的一个子序列被复制下来。
		被复制的组件的编号等于 length 参数。
		源数组中位置在 srcPos 到 srcPos+length-1 之间的组件被分别复制到目标数组中的 destPos 到 destPos+length-1 位置。
		public static void arraycopy(int[] src, int srcPos, int[] dest,int destPos, int length) {
		}*/
	private static void test06() {
		int[] src = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] dest = new int[10];
		MyArrayUtils.printArray(src);
		MyArrayUtils.printArray(dest);
	//	MyArrayUtils.arrayCopy(src, 2, dest, 5, 3);
		MyArrayUtils.printArray(dest);//[0,0,0,0,0,3,4,5,0,0]
		// 分析：
		// [1,2,3,4,5,6,7,8,9,10]
		// [0,0,0,0,0,3,4,5,0,0] 推算结果
		// [0,0,0,0,0,3,4,5,0,0] 打印结果

		System.arraycopy(src, 2, dest, 5, 3);//System类中的arraycopy方法
		MyArrayUtils.printArray(dest);//[0,0,0,0,0,3,4,5,0,0]
	}

	private static void test05() {
		int[] arr = { 10, 20, 30, 10, 50, -30, 10 };
		// 1.增强for循环
		for (int e : arr) {
			System.out.println("增强for循环(语法糖)：" + e);
		}

		// 2. 方法的可变参数(语法糖)，可变参数只能作为最后一个参数，避免参数的歧义性，
		int sum = getSum(arr);
		System.out.println("sum:" + sum);
		System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));//反编译发现会先创建int型数组
	}

	//	public static double getSum(int[] arr2) {//方法签名=方法名+参数列表，这个会和可变参数的判定为同一个，编译失败。
	//
	//		return 0;
	//	}

	public static int getSum(int... arr) {//反编译发现arr其实是一个int数组

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	private static void test04() {
		int[] arr = { 10, 20, 30, 10, 50, -30, 10 };
		int ret = MyArrayUtils.indexOf(arr, 110);
		System.out.println(ret);

	}

	private static void test03() {
		String[] arr = { "A", "B", "C", "D", "E" };
		MyArrayUtils.printArray(arr);//[A,B,C,D,E]
		String[] ret = MyArrayUtils.reverseArray(arr);
		MyArrayUtils.printArray(ret);
	}

	private static void test02() {
		String[] arr = { "A", "B", "C", "D", "E" };
		System.out.println(arr);//[Ljava.lang.String;@7852e922
		MyArrayUtils.printArray(arr);//[A,B,C,D,E]
	}

	private static void test01() {
		int[] arr = { 11, 234, 563, 1231, 54, 123, 454, 65642, 234, 343556, 324, 234235, 564 };
		System.out.println(MyArrayUtils.getMax(arr));
	}

}
