package com.ws.computer.dayi.chapter4;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月26日下午3:44:16
 */
public class StudentTest {
	
	public static void main(String[] args) {
		Student stu = new Student();
		
		Student stu1 = new  Student("张三",90);
		
		//toString方法
		
	   System.out.println(stu.toString());
	   System.out.println(stu1.toString());
	   //Object
	   
	   // Object(超类)
	   System.out.println("=====================");
	   System.out.println(stu);//stu.toString()
	   System.out.println(stu1);//stu1.toString();
	}

}
