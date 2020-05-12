package com.ws.computer.chapter8.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日下午3:05:08
 */
public class WechatPay implements Pay {

	@Override
	public void pay() {
		System.out.println("向微信发起扣款....");
	}

}
