
package com.ivy.github.day09;

//包装类中的缓存设计(享元模式 FlyWeight),本质就是缓存设计:
//Byte、Short、Integer、Long：缓存[-128，127]区间的数据；
//Character：缓存[0，127]区间的数据；

public class FlyWeightDemo {

	public static void main(String[] args) {

		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(i1 == i2);
		System.out.println(i2 == i3);
		System.out.println(i1 == i3);
		
		System.out.println(i4 == i3);
		
		
	}
}
