package com.ws.computer.dayi.chapter5.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月15日上午8:55:15
 */
public class EqualsTest {
	
	public static void main(String[] args) {
		
		//1.八种基本数据类型： byte  char boolean short int long float double
		int myInt1 = 100 ;
		int myInt2 = 100;
		//八种基本数据类型，比较变量的值是否相等，就用==比较
		System.out.println(myInt1 == myInt2);
		
		//2.引用数据类型
		Student stu1 = new Student("张三",311105);
		System.out.println(stu1);
		Student stu2 = new Student("张三",311105);
		System.out.println(stu2);
		System.out.println(stu1 == stu2 );
		
		//3.equals方法:比较对象的成员变量值。如果两个对象的成员变量值一一相等，
		//那么我就认为你是同一个对象
		//就返回true;
		System.out.println("=====================================");
		System.out.println(stu1.equals(stu2));
		//this == obj 等价于 stu1 == stu2 ;
		//3.1所有的类都会默认继承Object类，超类
		
		//4.1.== 是个运算符  equals是个方法
		//4.2.equals方法是用来比较两个对象的成员变量值是否对应一一相等
		// == 比较两个对象的内存地址是否 相等。
		
		
		//5.String类
		
		String str1 = new String("abc");
		
		String str2 = new String("abc");
		System.out.println("==============");
		//System.out.println(str1 == str2 );
		//String重写了equlas方法
		System.out.println(str1.equals(str2));
		
		//5.1常量池
		//首先去常量池找是否有"abc"这个对象，如果没有就会在常量池new出一个来
		//如果常量池中有"abc"这个对象，就会把"abc"这个对象的内存空间地址赋值给str3;
		
		String str3 = "abc";
		String str4 = "abc";
		String str5 = "abc";
		System.out.println("===============");
		System.out.println(str3 == str4);
		System.out.println(str4 == str5 );
		System.out.println(str3 == str5 );
	}
}
