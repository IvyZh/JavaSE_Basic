package com.ivy.github.day05;

import com.ivy.github.day04.MyArrayUtils;

// 排序Demo

//排序的分类：
//选择排序（直接选择排序、堆排序）
//交换排序(冒泡排序、快速排序)
//插入排序（直接插入排序、二分法插入排序、Shell排序）
//归并排序等。
//排序有升序排列和降序排列之分，我们现在单讲升序排列：
//我们主要讲解冒泡，选择，插入排序，当然在开发中因为性能问题，我们都不会自己写排序算法，不过排序在笔试题里却是常客。

public class SortDemo {

	public static void main(String[] args) {
		test01();//冒泡排序
		test02();//选择排序
		test03();//选择排序-加强版

		test04();//二分查找
	}

	private static void test04() {
		int[] arr = { 2, 9, 6, 7, 4, 1, 5, 3 };
		MyArrayUtils.printArray(arr);
		selectionSort(arr);
		MyArrayUtils.printArray(arr);
		int key = 7;
		int index = binarySearch(arr, key);
		System.out.println("search " + key + " in index " + index);
	}

	/**
	 * 二分查找
	 * @param arr
	 * @param i
	 * @return
	 */
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

	private static void test03() {
		int[] arr = { 2, 9, 6, 7, 4, 1 };
		MyArrayUtils.printArray(arr);
		selectionSortPlus(arr);
		MyArrayUtils.printArray(arr);
	}

	private static void test02() {
		int[] arr = { 2, 9, 6, 7, 4, 1 };
		MyArrayUtils.printArray(arr);
		selectionSort(arr);
		MyArrayUtils.printArray(arr);
	}

	private static void test01() {
		int[] arr = { 2, 9, 6, 7, 4, 1 };

		MyArrayUtils.printArray(arr);
		bubbleSort(arr);
		MyArrayUtils.printArray(arr);
	}

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

}
