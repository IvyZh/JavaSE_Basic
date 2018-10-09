package com.ivy.github.day13;

public class TestDemo {

	static String[] names = { "aa", "bb", "cc" };

	public static void main(String[] args) {

		try {
			regeister("aa");
			System.out.println("ok 可以注册");
		} catch (LogicException e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(msg);
		}

	}

	private static void regeister(String name) {

		for (String n : names) {
			if (n.equals(name)) {
				throw new LogicException("用户名 " + name + " 已经存在！");
			}
		}
	}

}
