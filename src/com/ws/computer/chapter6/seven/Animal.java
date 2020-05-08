package com.ws.computer.chapter6.seven;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月8日上午10:56:37
 * 1.抽象类
 */
public abstract class Animal {
	
	//1.抽象类：就是用abstract关键字修饰的类是抽象类
	
	//2.抽象类里面包含属性
	public  int age  = 10  ;
	
	//3.抽象类里面包含方法：1)普通方法   2)抽象方法
	
	public void  info(){
		System.out.println("抽象类中的info方法");
	}
	
	//定义抽象方法:用abstract关键字修饰的方法是抽象方法。
	public abstract void eat();
	
	public abstract void run();
	
	//4.抽象方法只能定义在抽象类和接口中。
	
	
	//5.如果子类继承父类且父类为抽象类，那么子类必须重写抽象类中的所有抽象方法。
	
	
	
	

}
