package com.ivy.github.day23;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//使用反射调用构造器-创建对象
//构造器最大的作用:创建对象.
//为什么使用反射创建对象,为什么不直接来new呢?
//在框架中,提供给我们的都是字符串.

//使用反射创建对象:
//步骤:
//    1);找到构造器所在类的字节码对象.
//    2):获取构造器对象.
//    3):使用反射,创建对象
//-----------------------------------------------------------
//Constructor<T>类:表示类中构造器的类型,Constructor的实例就是某一个类中的某一个构造器
//常用方法:
//public T newInstance(Object... initargs):如调用带参数的构造器,只能使用该方式.
//     参数:initargs:表示调用构造器的实际参数
//     返回:返回创建的实例,T表示Class所表示类的类型
//如果:一个类中的构造器是外界可以直接访问,同时没有参数.,那么可以直接使用Class类中的newInstance方法创建对象.
// public Object newInstance():相当于new 类名();
//调用私有的构造器:

public class ReflectDemo4 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class personClass = Class.forName("com.ivy.github.day23.Person");
		//		Constructor<Person>[] cs = personClass.getDeclaredConstructors();
		//		for (Constructor c : cs) {
		//			System.out.println(c);//public com.ivy.github.day23.Person(java.lang.String,int)
		//			String name = c.getName();
		//		}

		//		Constructor c = personClass.getDeclaredConstructor();// java.lang.NoSuchMethodException: com.ivy.github.day23.Person.<init>()
		//		System.out.println(c);

		//		Constructor c = personClass.getDeclaredConstructor(String.class, int.class);
		//		Person p1 = (Person) c.newInstance("小明", "22");
		//		System.out.println(p1);

		Constructor<Person> c1 = personClass.getConstructor();
		Person p1 = c1.newInstance();

		System.out.println(p1.toString());

		//		Constructor<Person> c2 = personClass.getConstructor(String.class, int.class);
		//		Person p2 = c2.newInstance("zz", 12);
		//		System.out.println(p2);

		Constructor<Person> c3 = personClass.getDeclaredConstructor(String.class, int.class);
		System.out.println(c3);//public com.ivy.github.day23.Person(java.lang.String,int)
		c3.setAccessible(true);
		Person p3 = c3.newInstance("小明", 54);//error
		System.out.println(p3);

		System.out.println("-------");
		//		使用反射获取类中的方法:
		//			1):获取方法所在类的字节码对象.
		//			2):获取方法.

		Method[] ms = personClass.getMethods();

		//		public java.lang.String com.ivy.github.day23.Person.toString()
		//		public void com.ivy.github.day23.Person.doWork(int)
		//		public void com.ivy.github.day23.Person.doWork()
		//		public final void java.lang.Object.wait() throws java.lang.InterruptedException
		//		public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
		//		public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
		//		public boolean java.lang.Object.equals(java.lang.Object)
		//		public native int java.lang.Object.hashCode()
		//		public final native java.lang.Class java.lang.Object.getClass()
		//		public final native void java.lang.Object.notify()
		//		public final native void java.lang.Object.notifyAll()

		for (Method m : ms) {
			System.out.println(m);
		}

		System.out.println("-------");
		ms = personClass.getDeclaredMethods();
		//		public java.lang.String com.ivy.github.day23.Person.toString()
		//		public void com.ivy.github.day23.Person.doWork(int)
		//		private void com.ivy.github.day23.Person.doWork(java.lang.String,java.lang.String)
		//		public void com.ivy.github.day23.Person.doWork()

		for (Method m : ms) {
			System.out.println(m);
		}

		System.out.println("-------");

		//		public Method getDeclaredMethod(String name,
		//                Class<?>... parameterTypes):表示调用指定的一个本类中的方法(不包括继承的)
		//参数:
		//methodName: 表示被调用方法的名字
		//parameterTypes:表示被调用方法的参数的Class类型如String.class
		Method m = personClass.getDeclaredMethod("doWork", String.class, String.class);

		System.out.println(m);//private void com.ivy.github.day23.Person.doWork(java.lang.String,java.lang.String)

		System.out.println("-------");

		//		使用反射调用方法:
		//			1):获取方法所在类的字节码对象.
		//			2):获取方法对象.
		//			3):使用反射调用方法.

		Class pClass = Class.forName("com.ivy.github.day23.Person");
		Constructor<Person> cp = pClass.getDeclaredConstructor(String.class, int.class);
		System.out.println(cp);
		cp.setAccessible(true);
		Person pzk = cp.newInstance("zk", 18);
		Method mp = pClass.getDeclaredMethod("doWork", String.class, String.class);
		mp.setAccessible(true);
		mp.invoke(pzk, "params1", "params");

		System.out.println("-------");

		//使用反射调用静态方法

		Method sayMethod = pClass.getMethod("say");

		sayMethod.invoke(null, null);

		//使用反射调用数组参数的方法
		Method sumMethod = pClass.getMethod("sum", int[].class);
		int ret = (int) sumMethod.invoke(pzk, new int[] { 1, 2, 3, 4, 5 });
		System.out.println(ret);

		Method sum2Method = pClass.getMethod("sum2", String[].class);
		//sum2Method.invoke(pzk, new String[] { "a", "b", "c" });//error!!!
		sum2Method.invoke(pzk, new Object[] { new String[] { "a", "b", "c" } });//ok!!sum2方法被 调用：[Ljava.lang.String;@5c647e05

		//		王道:调用方法的时候把实际参数统统作为Object数组的元素即可.
		//		   Method对象.invoke(方法底层所属对象,new Object[]{  所有实参   });

		ret = (int) sumMethod.invoke(pzk, new Object[] { new int[] { 11, 22, 33, 4, 5 } });
		System.out.println(ret);//75
	}

}
