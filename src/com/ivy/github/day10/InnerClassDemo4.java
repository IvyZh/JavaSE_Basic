package com.ivy.github.day10;

//匿名内部类(Anonymous),是一个没有名称的局部内部类,适合只使用一次的类。

//在开发中经常有这样的类,只需要定义一次,使用一次就可以丢弃了,此时:不应该白白定义在一个文件中.
//在JavaSE/Android的事件处理中:不同的按钮点击之后,应该有不同的响应操作,首先使用匿名内部类.
//特点:
//1):匿名内部类本身没有构造器,但是会调用父类构造器.
//2):匿名类尽管没有构造器,但是可以在匿名类中提供一段实例初始化代码块,JVM在调用父类构造器后,会执行该段代码.
//3):内部类处理可以继承类之外,还可以实现接口.

public class InnerClassDemo4 {

	public static void main(String[] args) {

		testAnony(new AnonymousClass() {//匿名内部类(Anonymous),是一个没有名称的局部内部类,适合只使用一次的类。

			@Override
			public void doWork() {
				System.out.println("...doWork...");
			}
		});
	}

	private static void testAnony(AnonymousClass a) {
		System.out.println(a);
	}
}

interface AnonymousClass {
	void doWork();

}