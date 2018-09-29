package com.ivy.github.day08;

//继承关系: 子类可以继承到父类中部分的成员,那么此时子类是可以修改到父类的信息的.
//继承关系破坏封装,为了复用代码可能会让子类具有不该具有的功能.
//-----------------------------------------------------------------------------------
//为什么引入继承: 为了代码复用问题.
//解决代码复用问题,不一定非要使用继承,也可以使用”包含关系”(has  A).
//我没钱,但是我想开豪车,我想吃火锅:
//    方式1: 任一个富豪干爹.                   继承关系:
//    方式2:  把一个富豪绑架在我家里,挟天子以令诸侯!     组合关系/包含.

/**
 * 这个类来演示组合FunctionUtils 实现调用method1方法
 *
 */
public class CombinationDemo2 {
	FunctionUtils utils;

	public CombinationDemo2(FunctionUtils utils) {
		this.utils = utils;
	}

	public void test() {
		utils.method1();
	}

	public static void main(String[] args) {

		new CombinationDemo2(new FunctionUtils("组合方式")).test();
	}
}
