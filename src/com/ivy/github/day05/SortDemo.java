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

		for (int i = 0; i < arr.length; i++) {
			
		}

	}

}
