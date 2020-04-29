package com.ws.computer.dayi.chapter4;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日下午4:18:45
 */
public class PersonTest {
	
	
	public static void main(String[] args) {
		
		//取静态变量
		System.out.println(Person.name);
		
		//调用静态方法
		Person.method();
		
		//重点：1.静态方法里面不能调用非静态方法
		//2.非静态方法里面，可以调用静态方法
		
		
	}

}
