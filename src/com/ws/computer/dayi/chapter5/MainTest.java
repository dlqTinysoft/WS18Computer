package com.ws.computer.dayi.chapter5;



/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日下午4:54:16
 */
public class MainTest {
	
	
	
	public static void method(Pay pay){
		pay.pay();
	}
	
	public static void main(String[] args) {
		//多态
		Pay pay = new AliPay();
		method(new Pay() {
			
			@Override
			public void pay() {
				System.out.println("向微信发起支付。。。");
			}
		});
	}

}
