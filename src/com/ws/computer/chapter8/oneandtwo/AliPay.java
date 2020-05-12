package com.ws.computer.chapter8.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日下午3:01:48
 */
public class AliPay implements Pay{

	@Override
	public void pay() {
		System.out.println("向阿里发起扣款....");
	}

}
