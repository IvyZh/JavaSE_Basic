package com.ivy.github.day09;

//模板方法设计模式
//模板方法设计模式:在父类的一个方法中定义一个总体算法的骨架(模板方法)，而将某一些一些步骤延迟到子类中，
//因为不同的子类实现细节不同。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。


public class OperateTimeTemplate {

	public static void main(String[] args) {
		long time1 = new IntOperateTime().getTotalTime();
		long time2 = new StringOperateTime().getTotalTime();

		System.out.println(time1 + "..." + time2);
	}

}

abstract class Template {
	public long getTotalTime() {
		long begin = System.currentTimeMillis();
		doWork();
		long end = System.currentTimeMillis();
		return end - begin;
	}

	abstract void doWork();
}

class IntOperateTime extends Template {

	@Override
	void doWork() {
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

class StringOperateTime extends Template {

	@Override
	void doWork() {
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s += i;
		}

	}
}