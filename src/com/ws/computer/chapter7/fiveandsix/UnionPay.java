package com.ws.computer.chapter7.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月11日上午11:38:12
 */
public class UnionPay implements Pay{

	@Override
	public void pay() {
		System.out.println("向银联发起支付...");
	}

}