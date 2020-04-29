package com.ws.computer.chapter5.three_four;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日上午11:08:22
 */
public class Son  extends Father {
	//1.java里面的继承事单继承
	//2.Son类继承Father的属性(成员变量)和方法
	
	
	
	
	
	
	public int num = 1000 ;
	
	
	@Override
	public void info() {
		super.info();
		System.out.println("子类info");
		
	}

	public int numz = 10;
	
	public void method(){
		System.out.println("子类method");
	}
	
	public void methodA(){
		super.method();
	}
	
}
