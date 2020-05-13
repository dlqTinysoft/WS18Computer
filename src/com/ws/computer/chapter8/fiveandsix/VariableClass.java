package com.ws.computer.chapter8.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午9:00:14
 * 2.局部内部类：定义在方法里面的类
 */
public class VariableClass {
	
	private int n = 10;
	
	public void method(){
		
		//方法里面可以定义类，这个类叫做局部内部类
		class Inner{
			
			public int innerTon = 100 ;//成员变量
			void method(){
				System.out.println("局部内部类的方法》。。");
			}
		}
		Inner inner = new Inner();
		System.out.println(inner.innerTon);
		inner.method();
	}
	

}
