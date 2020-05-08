package com.ws.computer.chapter6.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月8日上午8:56:00
 */
public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("Cat喜欢吃鱼...");
	}

	@Override
	public void run() {
		System.out.println("Cat跑的很快...");
	}
	
	public int age = 100 ;
	

}
