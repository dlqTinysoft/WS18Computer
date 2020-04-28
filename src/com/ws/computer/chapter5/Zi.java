package com.ws.computer.chapter5;

/**
 * 作者： 董乐强 邮箱：dlq_tinysoft@163.com 时间：2020年4月28日上午10:57:25
 */
public class Zi  extends Fu{
	int numZi = 20;

	int num = 200;

	public void method(){
		System.out.println("子类的方法method");
	}
	public void methodZi() {
		method();
		this.method();
		super.method();
	}
	
	
}
