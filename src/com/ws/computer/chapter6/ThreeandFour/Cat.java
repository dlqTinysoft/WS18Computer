package com.ws.computer.chapter6.ThreeandFour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日上午10:59:54
 */
public class Cat  extends Animal{
	
	public  int age = 10 ;

	@Override
	public void eat() {
		System.out.println("猫喜欢吃鱼...");
	}

	@Override
	public void shut() {
	}
	
	public void run(){
		System.out.println("cat正在跑...");
	}
	
	public void methodCat(){
		System.out.println("子类的methodCat方法..");
	}

}
