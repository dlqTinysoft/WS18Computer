package com.ws.computer.chapter8.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午8:53:47
 */
public class OuterTest {
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.method();
		
		Outer.Inner inner = outer.new Inner();
		inner.test();
	}

}
