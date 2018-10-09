package com.ivy.github.day12;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		int ret = new Random().nextInt();
		System.out.println(ret);
		
		
		int ret1 = new Random(10).nextInt();
		System.out.println(ret1);
		
		int ret2 = new Random(10).nextInt();
		System.out.println(ret2);
		
		int ret3 = new Random().nextInt(100);
		System.out.println(ret3);
	}

}
