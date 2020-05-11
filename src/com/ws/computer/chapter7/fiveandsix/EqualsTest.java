package com.ws.computer.chapter7.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月11日上午10:56:49
 */
public class EqualsTest {
	
	public static void main(String[] args) {
		//equals和 == 的区别
		
		//1.八种基本数据类型  ： char  int  short  long double flaot boolean  byte
		
		int age = 10 ;
		int age1 = 10;
		
		System.out.println(age == age1);
		
		//2.引用类型
		Student stu1 = new Student(21, "张三");
		
		
		Student stu2 = new Student(21,"张三");
		
		System.out.println(stu1 ==  stu2 );
		
		//3.equlas方法：比较的式对象的内容（堆区里变量的值：成员变量的值，属性的值）
		
		//3.1:所有的类都会继承自Object类。
	
		System.out.println("===========================");
		System.out.println(stu1.equals(stu2));//this == object 等价stu1 == stu2
		
		//3.2:String类型，String是个类，String类重写equals方法.
		
		String str1 = new String("abc");
		
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		System.out.println(str1.equals(str2));
		
		
		String str3 = "abc" ;
		
		String str4 = "abc";
		System.out.println("================");
		System.out.println(str3 == str4);
		
		
		
		
	}

}
