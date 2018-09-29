package com.ivy.github.day09;

public class IntergerDemo {

	public static void main(String[] args) {

		// 装箱
		Integer i1 = 17;//自动装箱，实际上是调用的 Integer.valueOf(17) 这种方式
		Integer i2 = Integer.valueOf(17);//方式2
		Integer i3 = new Integer(17);//方式3

		System.out.println(i1 == i2);//true
		System.out.println(i1 == i3);//false
		System.out.println(i2 == i3);//false

		//拆箱
		int i4 = i3.intValue();

		//String和基本类型/包装类型之间的转换操作

		//	    String和int/Integer之间的转换操作:转换方法必须在String类中或Integer类中.
		//	    把String转换为包装类类型:
		//	    方式1: static Xxx  valueOf(String str)  :把String转换为包装类的对象
		//	         Integer i1 = Integer.valueOf(“123”);
		//	    方式2: new  Xxx(String str):
		//	         Integer i2= new Integer(“123”);
		//	     把包装类对象转换为String.
		//	        String  str =  任何对象.toString();
		//	    把基本数据类型转换为String:
		//	        String  str = 17 + ””;//这个方法比较low，一般使用String str = String.valueOf(17);
		//	    把String转换为基本数据类型:
		//	      static xxx parseXxx(String s)      :xxx表示8大基本数据类型
		//	      String  input=”12345”;
		//	      int num = Integer.parseInt(input);

		//把基本数据类型转换为String:
		String s1 = String.valueOf(17);

		//把String转换为基本数据类型:
		int ii = Integer.parseInt("17");

		Boolean b = new Boolean(false);
		System.out.println(b);//false

		Boolean b1 = new Boolean("xas");// 这个不会报错，只认可true/TRUE,为true,其他都是false.
		System.out.println(b1);//false

		Boolean b2 = new Boolean("true");
		System.out.println(b2);//true

		Boolean b3 = new Boolean("false");
		System.out.println(b3);//false
	}

}
