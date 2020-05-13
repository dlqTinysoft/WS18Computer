package com.ws.computer.chapter8.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午9:16:08
 */
public class Alipay  implements Pay{

	@Override
	public void pay() {
		System.out.println("向微信发起支付...");
	}

}
