package com.ws.computer.dayi.chapter5;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日下午4:55:31
 */
public class AliPay implements Pay{

	@Override
	public void pay() {
		System.out.println("向支付宝发起扣款...");
	}

}
