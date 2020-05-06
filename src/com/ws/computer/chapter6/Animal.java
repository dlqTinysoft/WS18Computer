package com.ws.computer.chapter6;

/**
 * 作者： 董乐强 
 * 邮箱：dlq_tinysoft@163.com
 *  时间：2020年5月5日下午10:08:51
 * 抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束。
 * 抽象类：抽象方法所在的类，必须是抽象类才行。在class之前写上abstract即可。
 * 
 * 如何使用抽象类和抽象方法： 
 *  1. 不能直接创建new抽象类对象。
 *  2. 必须用一个子类来继承抽象父类。 
 *  3. 子类必须覆盖重写抽象父类当中所有的抽象方法。
 *   覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上方法体大括号。 
 *  4. 创建子类对象进行使用。
 */
public abstract class Animal {
	
	public Animal(){
		System.out.println("我是抽象方法的构造方法...");
	}
	//抽象方法
	 public abstract void eat();
	 //普通方法
	 public void normalMethod(){
		 System.out.println("我是普通方法...");
	 }

}
