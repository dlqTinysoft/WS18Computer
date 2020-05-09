package com.ws.computer.chapter7.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午3:03:32
 */
public class MulitTest {
	
	public static void main(String[] args) {
		
		run(new Dog());
		
	}
	
	public static void run(Animal animal){
		//多态是运行时的特性。
		animal.eat();
	}

}
