package com.ws.computer.chapter7.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午3:18:23
 */
public class UnionPay implements  Pay{

	@Override
	public void pay() {
		System.out.println("向银联发起扣款...");
	}

}
