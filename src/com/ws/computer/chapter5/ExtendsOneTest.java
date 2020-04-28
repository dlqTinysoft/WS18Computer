package com.ws.computer.chapter5;

/**
 * 作者： 董乐强 
 * 邮箱：dlq_tinysoft@163.com 
 * 时间：2020年4月28日上午10:50:15
 * 1.在继承的关系中，“子类就是一个父类”。
 * 也就是说，子类可以被当做父类看待。 例如父类是员工，子类是讲师，那么“讲师就是一个员工”。关系：is-a。
 * 2.定义父类的格式：（一个普通的类定义） public class 父类名称 { // ... }
 * 3.定义子类的格式： public class 子类名称 extends 父类名称 { // ... } 
 */
public class ExtendsOneTest {
	
	public static void main(String[] args) {
		 // 创建了一个子类对象
        Teacher teacher = new Teacher();
        // Teacher类当中虽然什么都没写，但是会继承来自父类的method方法。
        //1.继承父类的方法
        teacher.method();
        //2.继承父类的属性 
        System.out.println(teacher.name);
        
        
	}
	

}
