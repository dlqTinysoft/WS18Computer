package com.ws.computer.chapter9.sixandfive;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日上午11:00:00
 */
public class MutliDemo {
	
	//多态
	
	//在继承的基础之上
	
	
	
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.method();
		
		//多态
		Pay pay = new AliPay();
		
		pay.pay();
		
		
		
	}
	
	
	

}
