package com.ws.computer.chapter6.fixandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日上午8:51:51
 */
public class Cat extends Animal {
	
	
//	public void info(){
//		System.out.println("cat的info方法");
//	}
	//public abstract void  run();

	
	public String name ;
	
	public  void run(){
		System.out.println("cat跑的很快...");
	}
	@Override
	public void eat() {
		System.out.println("Cat喜欢吃鱼...");
	}

	@Override
	public void shout() {
	}

	
	
	
}
