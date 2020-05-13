package com.ws.computer.chapter8.threeanddfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午11:03:45
 * 
 * 2.局部内部类：这个类定义在方法里面，叫做局部内部类
 */
public class VariableClass {
	
	
	public void method(){
		System.out.println("外部类的成员方法....");
	}
	
	
	//定义一个局部内部类
	
	public void method1(){
		
		//局部内部类
		class Inner{
			
			public String name  = "Inner" ; //成员变量
			
			//定义成员方法
			void test(){
				System.out.println("局部内部类的成员方法。。。。");
			}
			
		}
		Inner inner = new Inner();
		
		//调用局部内部类的成员属性
		System.out.println(inner.name);
		
		//调用局部内部类的成员方法
		inner.test();
	}
	
	
	
	
	
	
	
	

}
