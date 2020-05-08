package com.ws.computer.chapter6.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月8日上午9:14:50
 * 定义类实现接口
 */
public class MyInterfaceClass implements MyInterface,MyInterface1 {

	//1.子类只能继承一个父类，但是可以实现多个接口。
	//java单继承 多实现。
	@Override
	public void eat() {
		System.out.println("重写eat方法...");
	}

	@Override
	public void run() {
		System.out.println("重写run方法...");
	}

}
