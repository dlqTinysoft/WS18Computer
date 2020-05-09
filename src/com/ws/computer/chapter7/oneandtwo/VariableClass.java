package com.ws.computer.chapter7.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午3:37:34
 */
public class VariableClass {
	
	//在方法里面定义的内部类成为局部内部类。
	void test(){
		
		class Inner{
			int n = 10 ;
			void test(){
				System.out.println("内部类方法....");
			}
			
		}
		
		Inner inner = new Inner();
		inner.test();
		System.out.println(inner.n);
		
		
	}

}
