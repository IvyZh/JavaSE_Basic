package com.ivy.github.day09;

//通过对象调用字段,在编译时期就已经决定了调用那一块内存空间的数据.

//--------->字段不存在覆盖的概念,在多态时,不能有多态特征(在运行时期体现子类特征).
//只有方法才有覆盖的概念.
//
//当子类和父类存在相同的字段的时候,无论修饰符是什么(即使private),都会在各自的内存空间中存储数据.（隐藏关系）

//什么是代码块:
//在类或者在方法中,直接使用"{}"括起来的一段代码,表示一块代码区域。
//代码块里变量属于局部变量，只在自己所在区域(前后的{})内有效。【局部变量：方法参数、代码块、方法内部】
//根据代码块定义的位置的不同,我们又分成三种形式:
//1):局部代码块:直接定义在方法内部的代码块:
//        一般的,我们是不会直接使用局部代码块的,只不过我们会结合if,while,for,try等关键字联合,表示一块代码区域.
//2):初始化代码块(构造代码块):直接定义在类中.
//    每次创建对象的时候都会执行初始化代码块:
//        每次创建对象都会调用构造器,在调用构造器之前,会先执行本类中的初始化代码块.
//       通过反编译之后,我们发现,初始化代码也作为构造器的最初的语句.
//       我们一般不使用初始化代码块的,难看,即使要做初始化操作,我们一般在构造器中做即可,如果做初始化操作的代码比较多,此时构造器的结构比较混乱,此时专门定义一个方法做初始化操作,再在构造器中调用即可.
//3):静态代码块:使用static修饰的初始化代码块.
//     在主方法执行之前执行静态代码块,而且只执行一次.
//     main方法是程序的入口,为什么静态代码块优先于main方法执行.
//     --->:静态成员随着字节码的加载也加载进JVM,此时main方法还没执行,因为方法需要JVM调用.
//            先把字节码加载进JVM,  而后JVM再调用main方法.
//    一般的,我们用来做初始化操作,加载资源,加载配置文件等.

public class CodeBlockDemo {

	public static void main(String[] args) {
	}
}
