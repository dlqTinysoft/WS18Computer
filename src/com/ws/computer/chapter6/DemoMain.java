package com.ws.computer.chapter6;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月5日下午10:13:36
 */
public class DemoMain {
	
	public static void main(String[] args) {
		//Animal animal = new Animal(); 抽象类不能够new对象
		Cat cat = new Cat();
		cat.eat();
	}

}
