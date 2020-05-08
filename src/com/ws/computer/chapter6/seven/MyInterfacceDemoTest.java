package com.ws.computer.chapter6.seven;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月8日上午11:14:39
 */
public class MyInterfacceDemoTest implements MyInterface, MyInterface1{
	//单继承多实现

	@Override
	public void eat() {
		System.out.println("实现接口里面的抽象方法");
	}

	@Override
	public void run() {
		System.out.println("实现接口里面抽象方法...");
	}

	@Override
	public void methodA() {
		System.out.println("实现接口里面的抽象方法...");
	}

}
