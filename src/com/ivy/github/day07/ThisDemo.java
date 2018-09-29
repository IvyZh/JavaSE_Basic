package com.ivy.github.day07;

import java.util.regex.Pattern;

//使用this:

//①　解决成员变量和参数(局部变量)之间的二义性,必须使用;
//②　同类中实例方法间互调(此时可以省略this,但是不建议省略)。
//③　将this作为参数传递给另一个方法;
//④　将this作为方法的返回值(链式方法编程);
//⑤　构造器重载的互调，this([参数])必须写在构造方法第一行; 当多个构造器重载时,或者多个方法重载时,一般的,我们是少参数的调用多参数的
//⑥　static不能和this一起使用;
//              当字节码被加载进JVM,static成员以及存在了.
//             但是此时对象还没有创建,没有对象,就没有this.

public class ThisDemo {

	//③　将this作为参数传递给另一个方法;
	public static void main(String[] args) {

		String s1 = "abc";
		boolean b = s1.matches("^ab$");//falase
		boolean b2 = s1.matches("^abc$");//true
		System.out.println(b);

		//	    public boolean matches(String regex) {
		//	        return Pattern.matches(regex, this);
		//	    }

	}

}
