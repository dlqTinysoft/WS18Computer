package com.ws.computer.chapter6.ThreeandFour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日上午11:11:59
 * 接口的实现
 */
public class IntefaceDemo implements MyInterface , MyInterface1{

	@Override
	public void eat() {
		System.out.println("实现接口的抽象方法...");
	}

	@Override
	public void run() {
		System.out.println("实现接口的抽象方法...");
	}

}
