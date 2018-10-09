package com.ivy.github.day13;

public class ExceptDemo {

	public static void main(String[] args) {
		int ret = test1();
		System.out.println(ret);

		ret = test2();
		System.out.println(ret);

		ret = test3();
		System.out.println(ret);
	}

	private static int test3() {
		int a = 55;
		try {
			return a;
		} finally {
			++a;
		}
	}

	private static int test2() {
		int a = 77;
		try {
			return a;
		} finally {
			return 99;
		}

	}

	private static int test1() {

		try {
			return 1;
		} finally {
			return 100;
		}
	}

}
