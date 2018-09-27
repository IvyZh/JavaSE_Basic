package com.ivy.github.day02;

//因为float和double都不能精确的表示小数，那么在精度要求高的系统比如银行系统里，那怎么表示精确的小数呢？
//后面我们会讲BigDecimal类型，它表示任意精度的数据。
//精度高的话，会计算出错：

public class DecimalDemo {

	public static void main(String[] args) {

		double d1 = 1.000000000000001;
		double d2 = 2.000000000000002;
		System.out.println(d1 + d2);//3.0000000000000036

		System.out.println("\u0061");
	}

}
