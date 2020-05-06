package com.ws.computer.chapter6.ThreeandFour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日上午10:56:28
 */
public abstract class Animal {
	//1.类的前面加上关键字abstract，这个类就是抽象类。
	
	//2.抽象类里面可以包含抽象方法
	public  abstract void eat();
	public abstract void shut();
	//3.抽象类里面也可以包含普通方法
	public void info(){
		System.out.println("Animal 普通方法...");
	}
	//4.抽象方法不能定义在非抽象类中。
	
	//5.如果一个类继承抽象类，
	//那么这个子类必须重写抽象类所有抽象方法
	
	
	//=================
	public void run(){
		System.out.println("animal 正在跑...");
	}
	
	public void methodAnimal(){
		System.out.println("父类methodAnimal方法...");
	}
	
	
	

}
