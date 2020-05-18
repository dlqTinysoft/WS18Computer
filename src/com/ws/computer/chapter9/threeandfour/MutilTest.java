package com.ws.computer.chapter9.threeandfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日下午3:05:21
 */
public class MutilTest {
	
	public static void main(String[] args) {
		
		//多态第一种形式
		Animal animal = new Cat();
		animal.method();
		//多态的第二种形式
		Pay pay = new AliPay();
		pay.method();
		
		
		
		
	}

}
