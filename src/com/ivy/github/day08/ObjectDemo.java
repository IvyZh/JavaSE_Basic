package com.ivy.github.day08;

//Object类的常见方法:
//1): protected  void finalize() :当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
//             垃圾回收器在回收某一个对象之前,会先调用该方法,做扫尾操作. 该方法我们不要去调用.
//2): Class  getClass() :返回当前对象的真实类型。
//3): int hashCode(): 返回该对象的哈希码值,hashCode决定了对象再哈希表中的存储位置,不同对象的hashCode是不一样的.
//4): boolean equals(Object obj) :拿当前对象(this)和参数obj做比较.
//                在Object类中的equals方法,本身和 “ == ”符号相同,都是比较对象的内存地址.
//                官方建议:每个类都应该覆盖equals方法,不要比较内存地址,而去比较我们关心的数据.,因为我们关系的是内容数据,而不是内存地址.
//                 比如:两个学生对象,我们不管是如何new出来的,只要学号相同我就应该认为是同一个对象.
//                            两个字符串,只要内容相同,我们就认为是同一个字符串.
//5):String toString():表示把一个对象转换为字符串.
//                     打印对象时,其实打印的就是对象的toString方法.
//                     System.out.println(obj对象);等价于  System.out.println(obj对象.toString());
//                     默认情况下打印对象,打印的是对象的十六进制的hashCode值,但是我们更关系对象中存储的数据.
//                     官方建议我们:应该每个类都应该覆盖toString,返回我们关心的数据.

public class ObjectDemo {

	public static void main(String[] args) {
		String s1 = new String("AA");
		String s2 = new String("AA");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
	}
}
