package com.ws.computer.chapter8.sevenandeight;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月15日上午11:02:15
 */
public class OuterTest {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();
		
		//new出成员内部类的对象
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner.m);
		inner.test();
		
	}

}
