package com.ws.computer.chapter9.sixandfive;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日上午11:03:43
 */
public class AliPay  implements Pay{

	@Override
	public void pay() {
		System.out.println("向阿里发起支付....");
	}

}
