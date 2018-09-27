package com.ivy.github.day04;

public class MyArrayUtils {

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	public static void printArray(String[] arr) {
		if (arr == null) {
			System.out.println("null");
			return;
		}

		String ret = "[";
		for (int i = 0; i < arr.length; i++) {
			ret = ret + arr[i];
			if (i != arr.length - 1) {
				ret = ret + ",";
			}
		}
		ret = ret + "]";
		System.out.println(ret);
	}

	public static void printArray(int[] arr) {
		if (arr == null) {
			System.out.println("null");
			return;
		}

		String ret = "[";
		for (int i = 0; i < arr.length; i++) {
			ret = ret + arr[i];
			if (i != arr.length - 1) {
				ret = ret + ",";
			}
		}
		ret = ret + "]";
		System.out.println(ret);
	}

	public static String[] reverseArray(String[] arr) {
		String[] newArray = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[arr.length - 1 - i];
		}
		return newArray;
	}

	// 这种线性搜索的性能不高，如果数据很多10w数据呢?二分查找
	public static int indexOf(int[] arr, int e) {
		for (int i = 0; i < arr.length; i++) {
			if (e == arr[i])
				return i;
		}
		return -1;
	}

	// 数组拷贝
	/**
	 * 
	 * @param src 原数组
	 * @param srcPos 原数组起始位置
	 * @param dest 目标数组
	 * @param destPos 目标起始位置
	 * @param length 拷贝长度
	 */
	public static void arrayCopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
		for (int i = srcPos; i < srcPos + length; i++) {
			dest[destPos] = src[i];
			destPos++;
		}

	}
}
