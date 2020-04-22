package com.ws.computer.chapter3;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月21日下午1:50:40
 * static关键字讲解：static关键字最基本的用法是：
     1、被static修饰的变量属于类变量，可以通过类名.变量名直接引用，而不需要new出一个类来
     2、被static修饰的方法属于类方法，可以通过类名.方法名直接引用，而不需要new出一个类来
 */
public class StaticTest {
	
	public static String name = "StaticTest";
	
	public static void main(String[] args) {
		System.out.println(StaticTest.name);
		int add = StaticTest.getAdd(1, 2);
		System.out.println(add);
	}
	
	public static int getAdd(int a , int b){
		return a + b;
	}

}
