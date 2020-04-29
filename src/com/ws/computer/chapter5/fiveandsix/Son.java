package com.ws.computer.chapter5.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日上午9:01:23
 */
public class Son  extends Father{
	//重点：1. extends 后面只能写一个类
	//java继承是单继承的。
	//2.继承Father的属性和方法
	
	//public String info = "李四" ;
	
	//public String password = "abc";
	
	
//	public void printInfo(){
//		System.out.println("子类");
//	}
	
	
	public int num = 100 ;
	
	public void method(){
		//指名调用父类的num
		System.out.println(super.num);
		System.out.println(num);
		System.out.println(this.num);//son.num
	}
	
	
	
	
	
	
	
	public void methodAA(){
		info();
		this.info();// info(); => son.info()
		super.info();
	}







	
	public void info() {
		
	}
	
	
	
	
	
	
	
	
	
}
