package com.ws.computer.chapter8.threeanddfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午11:16:27
 */
public class AliPay  implements Pay{

	@Override
	public void pay() {
		System.out.println("向支付宝发起扣款...");
	}

}
