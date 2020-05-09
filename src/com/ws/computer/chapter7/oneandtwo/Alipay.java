package com.ws.computer.chapter7.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午3:17:29
 */
public class Alipay  implements  Pay{

	@Override
	public void pay() {
		System.out.println("向支付宝发起扣款 ....");
	}

}
