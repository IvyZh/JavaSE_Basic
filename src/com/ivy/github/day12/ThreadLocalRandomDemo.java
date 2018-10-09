package com.ivy.github.day12;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {

	public static void main(String[] args) {
		ThreadLocalRandom t = ThreadLocalRandom.current();
		for (int i = 0; i < 100; i++) {
			int ret = t.nextInt(1, 9);//[1,9)

			//System.out.println(ret);
			if (ret == 9) {
				System.out.println(ret);
			}
		}
		System.out.println("END.");

	}

}
