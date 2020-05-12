package com.ws.computer.chapter8.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日下午3:03:31
 */
public class PayTest {
	
	
	public static void main(String[] args) {
		Pay pay = new AliPay();
		pay.pay();
		
		pay = new WechatPay();
		pay.pay();
	}
	
	

}
