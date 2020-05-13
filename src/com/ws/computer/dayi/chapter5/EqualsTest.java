package com.ws.computer.dayi.chapter5;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日下午4:18:48
 * 
 * equals和== 的区别
 */
public class EqualsTest {
	
	public static void main(String[] args) {
		
		//1.八种基本数据类型：byte char boolean short int long float double 
		//基本数据类型的用 == 来比较两个变量的值是否相等。
		
		int myInt1 = 1 ;
		
		int myInt2 = 1 ;
		
		System.out.println(myInt1 == myInt2);
		
		
		//2.引用类型， 比较两个引用类型变量的值
		
		Student stu1 = new Student(13, 20, "张三");
		System.out.println(stu1);
		
		Student stu2 = new Student(12,20,"张三");
		System.out.println(stu2);
		System.out.println(stu1 == stu2 );
		//== 比较栈区中存储单元的值。
		
		//3.使用equals方法比较对象的内容（成员变量的值）
		//3.1所有的类都继承至Object类
		//true or false ??
		System.out.println("============");
		System.out.println(stu1.equals(stu2));//stu1 == stu2 
		
		
		String str1 = new String("abc");//堆区的
		String str2 = new String("abc");
		System.out.println("===============");
		System.out.println(str1 == str2);
		System.out.println("===========");
		//String类它重写了equlas
		System.out.println(str1.equals(str2));
		
		
		String str3 = "abc";//常量池
		
		String str4 = "abc";
		
		String str5 = "abc";
		System.out.println(str4 == str5 );
		
		
		
	}
	
	

}
