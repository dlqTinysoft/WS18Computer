package com.ws.computer.chapter8.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午9:15:12
 * 
 * 4.匿名内部类：重点
 */
public class PayTest {
	
	public static void main(String[] args) {
		
		
		//method(new Alipay());
		
		//匿名对象
		//匿名内部类
		method(new Pay() {
			
			@Override
			public void pay() {
				System.out.println("匿名内部类...");
			}
		});
		
	  
	}
	
	
	
	public static void method(Pay pay){
		pay.pay();
	}

}
