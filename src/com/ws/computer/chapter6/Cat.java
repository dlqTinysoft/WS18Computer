package com.ws.computer.chapter6;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月5日下午10:12:44
 */
public class Cat extends Animal {
	
	public Cat(){
		System.out.println("cat的构造方法...");
	}
	
	public void catMethod(){
		System.out.println("cat自己独有的方法..");
	}

	@Override
	public void eat() {
		System.out.println("cat喜欢吃鱼...");
	}

}
