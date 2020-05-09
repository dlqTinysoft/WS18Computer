package com.ws.computer.chapter7;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午1:09:23
 * 
 * 局部内部类
 */
public class VariableClass {
	
	
	int m = 0 ;
	void test(){
		System.out.println("外部类成员方法...");
	}
	
	//在方法里面定义的类叫做局部内部类
	 void test1(){
		
		//1.局部内部类可以访问外部类的成员变量和方法
		class Inner{
			int n = 10 ;
			void show(){
				System.out.println("外部类变量：m="+m);
				//外部类的方法
				test();
			}
		}
		
		Inner inner = new Inner();
		//2.只能在方法里面访问局部内部类的方法和属性。
		inner.show();
		
	}

}
