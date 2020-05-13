package com.ws.computer.chapter8.threeanddfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午11:01:20
 */
public class OuterTest {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();
		//new成员内部类
		Outer.Inner inner = outer.new Inner();
		inner.test();
		inner.test1();
	}

}
