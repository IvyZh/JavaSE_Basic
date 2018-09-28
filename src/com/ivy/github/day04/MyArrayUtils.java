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

	//---Sort----
	/**
	 * 冒泡排序
	 * @param arr
	 * 冒泡排序(Bubble Sort)：
	这是最简单的排序法，基本思路：
	对未排序的各元素从头到尾依次比较相邻的两个元素大小关系，若大于则交换位置，经过第一轮比较排序后可得出最大值，然后使用同样的方法把剩下的元素逐个比较即可。
	可以看出若有N个元素，那么一共要进行N-1轮比较，第M轮要进行N-M次比较。
	 */
	private static void bubbleSort(int[] arr) {
		// 2, 9, 6, 7, 4, 1

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

	}

	/**
	 * 选择排序(Selection Sort)：
	基本思路：选择某个索引位置的元素，然后和后面元素依次比较，若大于则交换位置，经过第一轮比较排序后可得出最小值，然后使用同样的方法把剩下的元素逐个比较即可。
	可以看出选择排序，第一轮会选出最小值，第二轮会选出第二小的值，直到最后。
	第一轮从arr[0]和后面元素相比较，第二轮从arr[1]和后面的元素相比较，依次类推。N个数要进行N-1轮。选择排序每一轮只进行一次交换，相对于冒泡排序效率高一些。
	 * @param arr
	 */

	private static void selectionSort(int[] arr) {

		int times = arr.length - 1;// 需要times轮比较

		for (int i = 0; i < times; i++) {
			for (int j = i + 1; j <= times; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}

	}

	private static void selectionSortPlus(int[] arr) {

		for (int times = 0; times < arr.length - 1; times++) {
			int minIndex = times;
			for (int i = times + 1; i < arr.length; i++) {
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			swap(arr, times, minIndex);
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//---Search----
	private static int binarySearch(int[] arr, int key) {

		int low = 0;
		int high = arr.length - 1;
		int middle = 0;

		while (low <= high) {
			middle = (low + high) / 2;
			if (key == arr[middle]) {
				return middle;
			} else if (key > arr[middle]) {
				low = middle + 1;
				middle = (middle + high) / 2;
			} else {
				high = middle - 1;
				middle = (middle + high) / 2;
			}
		}

		return -1;
	}
}
