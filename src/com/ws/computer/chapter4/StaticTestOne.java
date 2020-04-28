package com.ws.computer.chapter4;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月28日下午3:03:00
 */
public class StaticTestOne {
	
	public static void main(String[] args) {
		
		//1.通过类名.成员变量名
		System.out.println(Person.name);
		
		Person.name = "dlq";
		
		System.out.println(Person.name);
		
		//2.通过new对象的方式，来拿到改对象的name
		//不推荐
		Person p = new Person();
		
		System.out.println("=====================");
		System.out.println(p.name);
		
		Person p1 = new Person();
		System.out.println(p1.name);
		
		Person p2 = new Person();
		System.out.println(p2.name);
		
		//静态方法
		
		Person.method();
		
		//不推荐这种写法
		p2.method();
		
		//1.静态方法中不能调用非静态方法
		//2.非静态方法中可以调用静态方法
		
		//new StaticTestOne();
		
	
	}
	
	
	public void methodA(){
		methodStatic();
		
	}
	public static void methodStatic(){
		//methodA();
	}

}
