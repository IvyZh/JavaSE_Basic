### 0. 提交Github地址

> https://github.com/IvyZh/JavaSE_Basic.git


### 1. 小白使用eclipse提交到GitHub (详细步骤)

> https://blog.csdn.net/bendanany/article/details/78891804


### 2. 以下代码运行不报错

	System.out.println(0 / 0.0);//NaN
	System.out.println(1 / 0.0);//Infinity
	System.out.println(-1 / 0.0);//-Infinity

### 3. 实例化和初始化的区别
实例化一般是由类创建的对象，在构造一个实例的时候需要在内存中开辟空间，即   Student   s = new Student();

初始化   实例化的基础上，并且对 对象中的值进行赋一下初始值


###4. 在for循环嵌套优化这个Demo中

优化前耗时： 5305 5039 5279 5026

第一层优化耗时：5439 5760 5549 5483

第二层优化耗时：5416 5356 5459 5415

为什么这么不明显？反而耗时更长？？？

