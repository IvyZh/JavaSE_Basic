package com.ivy.github.day03;

// for循环嵌套优化
public class ForForOptimize {

	public static void main(String[] args) {

		long t1 = System.currentTimeMillis();
		// 题目1：
		// method1();// 5305 5039 5279 5026
		long t2 = System.currentTimeMillis();
		System.out.println("time1:" + (t2 - t1));

		// 优化1：
		t1 = System.currentTimeMillis();
		//method2();//5439 5760 5549 5483
		t2 = System.currentTimeMillis();
		System.out.println("time2:" + (t2 - t1));
		
		
		// 优化3：
		t1 = System.currentTimeMillis();
		method3();//5416 5356 5459 5415
		t2 = System.currentTimeMillis();
		System.out.println("time3:" + (t2 - t1));
		

	}

	private static void method3() {
		int count = 0;
		int i,j,k;
		for (  i = 0; i < 10; i++) {
			for (  j = 0; j < 100; j++) {
				for (  k = 0; k < 1000; k++) {
					count++;
					System.out.println("count:" + count);//1000000
				}
			}
		}
		
	}

	private static void method1() {
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 100; j++) {
				for (int k = 0; k < 10; k++) {
					count++;
					System.out.println("count:" + count);//1000000
				}
			}
		}
		// 分析：SystemOutPrint 执行 1000*100*10次；i 初始化 1000,j 初始化 1000*100 ，k初始化 10*100*1000

		// i 实例化 1次  		初始化1  		比较 1000  		自增1000
		// j 实例化 1000次   	  	初始化1000  	比较 100000  		自增100000
		// k 实例化 100000次  	初始化100000 	比较 1000000		自增1000000  

		// 总共初始化次数：1000000+100000+1000 =  1101000
		// 耗时：5351
	}

	private static void method2() {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				for (int k = 0; k < 1000; k++) {
					count++;
					System.out.println("count:" + count);//1000000
				}
			}
		}

		// i 实例化 1次  		初始化1  		比较 10  		自增10
		// j 实例化 100次   	  	初始化100  	比较 1000  	自增1000
		// k 实例化 1000次  		初始化1000	比较 1000000	自增1000000  
	}

}
