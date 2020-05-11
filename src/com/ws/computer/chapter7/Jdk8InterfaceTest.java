package com.ws.computer.chapter7;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月11日上午9:35:04
 */
public class Jdk8InterfaceTest {
	
	
	public static void main(String[] args) {
		
		doSomething(()->System.out.print("Lamda执行了...."));
		
	}
	
	
	private static void doSomething(Jdk8Interface jdk8Interface){
		jdk8Interface.method();
	}
	

}
