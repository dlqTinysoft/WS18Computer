package com.ws.computer.chapter7;

import com.ws.computer.chapter7.Outer.Inner;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午1:04:22
 */
public class OuterTest {
	
	public static void main(String[] args) {
		//创建外部类对象
		Outer outer = new Outer();
		//创建内部类对象
		Inner inner = outer.new Inner();
		outer.show(); //外部类可以访问内部类的成员变量和方法
		inner.test(); //内部类可以访问外部类的成员变量和方法
		
	}

}
