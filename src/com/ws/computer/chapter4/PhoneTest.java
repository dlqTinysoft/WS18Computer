package com.ws.computer.chapter4;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月26日下午3:04:06
 */
public class PhoneTest {
	
	public static void main(String[] args) {
		
//		//访问静态变量：类名.变量名
//		System.out.println(Phone.info);
//		//通过new对象来访问静态变量
//		Phone p = new Phone();
//		System.out.println(p.info);
//		
//		//访问静态方法：类名.方法名
//		Phone.method();
//		//通过new对象来访问静态方法
//		Phone p1 = new Phone();
//		p1.method();
		
		
		
//		Phone.info = "宝马车很帅";
//		
//		Phone p = new Phone();
//		
//		System.out.println(p.info);
//		
//		Phone p1 = new Phone();
//		System.out.println(p1.info);
//		
//		p.info = "苹果x很优秀";
//		
//		System.out.println(p1.info);
//		
//		System.out.println(Phone.info);
		
		
		//静态方法
		//1.静态方法里面不能调用非静态方法
		//2.非静态方法里面能调用静态方法
		//静态代码块
		Phone p = new Phone();
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone.method();
		
		
	}
	
	public  void methodA(){}

}
