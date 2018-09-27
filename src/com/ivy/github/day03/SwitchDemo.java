package com.ivy.github.day03;

//switch语句选择的基本数据类型只有四种：byte、short、char、int，没有long。
//支持的引用类型是以上四个基本数据类型的包装类（后讲），
//依次是Byte、Short、Character、Integer以及从Java5开始支持的枚举和Java7开始支持的String类。
public class SwitchDemo {

	public static void main(String[] args) {

		int i = 9;
		byte b = 2;
		short s = 2;
		char c = 1;
		long l = 100L;//不支持
		
		
		

		switch (i) {
		case 1:
			break;
		}
		switch (s) {
		case 1:
			break;
		}

		switch (b) {
		case 1:
			break;
		}

		switch (c) {
		case 1:
			break;
		}
		//		switch (l) {//除long之外的整型类型
		//		case 1:
		//			break;
		//		}
	}

}
