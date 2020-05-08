package com.ws.computer.chapter6.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月8日上午8:50:53
 */
public abstract class Animal {
	
	//1.什么是抽象类：被abstract修饰的类就是抽象类。
	//2.抽象类里面可以写抽象方法
	//什么是抽像方法：用abstract修饰的方法，是抽象方法
	//3.抽象方法只能写在抽象类和接口中。
	public  abstract  void eat();
	
	public abstract void run();
	
	//4.抽象类也可以写普通方法
	public  void info(){
		System.out.println("父类中info方法。。。");
	}
	
	//5.如果一个类继承抽象类，那么这个类（子类）必须重写抽象类中的所有抽象方法。

	
	
	public  int age = 10 ;
	
	
	
	
	
}
