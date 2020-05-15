package com.ws.computer.chapter8.sevenandeight;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月15日上午11:14:17
 */
public class StaticTest {
	
	public static void main(String[] args) {
		
		//new出静态内部类的对象
		StaticClass.Inner inner = new StaticClass.Inner();
		System.out.println(inner.m);
		inner.test();
		
	}

}
