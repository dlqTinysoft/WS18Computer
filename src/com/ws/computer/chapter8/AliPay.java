package com.ws.computer.chapter8;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日上午10:58:06
 */
public class AliPay implements Pay {

	@Override
	public void pay() {
		System.out.println("向支付宝发起支付操作....");
	}

}
