package com.ws.computer.chapter6.fixandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日上午8:51:27
 */
public abstract class Animal {
	//抽象类
	//抽象类：1.抽象方法
	//1.抽象方法只能写在抽象类里面
	//2.抽象类里面可以写普通方法
	
	
	//抽象方法
	public abstract void eat();
	public abstract void shout();
	
	public void info(){
		System.out.println("animal的info方法...");
	}

}
