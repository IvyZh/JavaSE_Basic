package com.ivy.github.day03;

public class PageDemo {

	public static void main(String[] args) {
		int count = 61;
		int pageSize = 10;
		int page = 0;

		page = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;

		System.out.println(count + "..." + page);

	}

}
