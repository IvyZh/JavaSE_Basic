package com.ivy.github.day10;

//静态内部类:
//使用static修饰的内部类.
//特点:
//1):静态内部类的实例不会自动持有外部类的特定实例的引用,在创建内部类的实例时,不必创建外部类的实例.
//     Outter.Inner in = new Outter.Inner();
//2):静态内部类可以直接访问外部类的静态成员,如果访问外部类的实例成员,必须通过外部类的实例去访问.
//3):在静态内部类中可以定义静态成员和实例成员.
//4):测试类可以通过完整的类名直接访问静态内部类的静态成员.
public class InnerClassDemo2 {

	public static void main(String[] args) {
		OuterClass.Inner inner = new OuterClass.Inner();
		int age = inner.getAge();
		int num = inner.getNum();
		int weight = inner.weight;
		System.out.println(age+"..."+num+"..."+weight);
	}

}

class OuterClass {

	int age = 17;
	static int height = 188;

	static class Inner {
		int num = 22;
		static int weight = 77;//在静态内部类中可以定义静态成员和实例成员.

		public int getNum() {
			return num;
		}

		public int getAge() {
			return new Outer().age;//ok
			//return age;//error,静态内部类可以直接访问外部类的静态成员,如果访问外部类的实例成员,必须通过外部类的实例去访问.
		}

		public int getHeight() {
			return height;//error,静态内部类可以直接访问外部类的静态成员
		}
		
	}
}
