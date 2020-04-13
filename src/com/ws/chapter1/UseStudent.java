package com.ws.chapter1;
/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 单位：武汉生物工程学院
 * 创建对象，并访问类中的成员
 */
public class UseStudent {
	public static void main(String[] args) {
		//创建对象格式：类名 对象名 = new 类名();
		//基本类型和引用类型
		Student stu = new Student();
		System.out.println(stu);
		//打印成员变量值
		System.out.println(stu.name);
		System.out.println(stu.age);
		//给成员变量赋值
		stu.name = "董乐强";
		stu.age = 26;
		//再次打印成员变量值
		System.out.println(stu.name);
		System.out.println(stu.age);
		//调用成员方法
		stu.study();
		
	}
}
