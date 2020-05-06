package com.ws.computer.chapter6;

/**
 * 作者： 董乐强 
 * 邮箱：dlq_tinysoft@163.com 
 * 时间：2020年5月6日上午7:17:05 
 * 1.在多态的代码当中，成员方法的访问规则是：
 * 2.看new的是谁，就优先用谁，没有则向上找。
 * 
 * 
 */
public class MultiMethodDemo {

	public static void main(String[] args) {
		Fu object = new Zi();
		object.method();
		object.methodFu();
		// object.methodZi();
	}

}
