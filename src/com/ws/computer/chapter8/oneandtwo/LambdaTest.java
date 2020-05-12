package com.ws.computer.chapter8.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日下午3:08:30
 */
public class LambdaTest {
	
	
	public static void main(String[] args) {
		
		//1.匿名对象
		method(new LadbdaInterface() {
			
			@Override
			public void printInfo() {
				System.out.println("实现接口的printinfo方法，匿名内部类");
			}
		});
		
		method(new LambdaPrintInfo());
		
		//2.采用lambda表达式
		method(()->{
			System.out.println("lambda表达式语法");
		});
		
		
		
	}
	
	private static void method(LadbdaInterface lad){
		lad.printInfo();
	}
	

}
