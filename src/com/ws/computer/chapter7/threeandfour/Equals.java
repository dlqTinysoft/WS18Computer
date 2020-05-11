package com.ws.computer.chapter7.threeandfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月11日下午3:02:14
 */
public class Equals {
	
	
	public static void main(String[] args) {
		
		//1.== 比较的是栈区的存单元里面值是否相等    
		
	   //八种基本数据类型：  byte char boolean short int long float double 
		
		int myInt1 = 100 ;
		int myInt2 = 100 ;
		System.out.println(myInt1 == myInt2);
		
	  //2.引用数据类型
		Student stu1 = new Student(1111,"李四");
		
		Student stu2 = new Student(1111,"李四");
		
		System.out.println(stu1 == stu2 );
		
	 //3.equals方法，是用来比较对象内容（对象的成员变量值）。也可以说比较的是堆区内存单元的值。
		System.out.println("=====================");
		//stu1 == stu2 
		System.out.println(stu1.equals(stu2));
		//
	
	 //4.继承：子类和父类。如果子类里面没有方法，会去找父类。
	 //所有的类都继承至Object类
		
		
	 //5.定义一个类，要重写equals方法。
		
	
	//String类： String也是引用类型
		
	String  str1 = new String("abc");
	
	String str2 = new String("abc");
	
	//6.String类 重写了Object类中的equals方法..
	System.out.println(str1 .equals(str2) );
	
	//ArrayList
	
	//7.只有String类，不用new也可以产生字符串对象。
	//常量池
	String str3 = "abcd";
	String str4 = "abcd";
	String str5 = "abcd";
	String str6 = "abcd";
	System.out.println("==================");
	System.out.println(str3 == str4 );
	System.out.println(str4 == str5);
	System.out.println(str5 == str6 );
	}

}
