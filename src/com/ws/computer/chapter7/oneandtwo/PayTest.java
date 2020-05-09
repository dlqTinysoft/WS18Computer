package com.ws.computer.chapter7.oneandtwo;

import java.util.List;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午3:08:22
 */
public class PayTest {
	
	public static void main(String[] args) {
		
		pay1(new Pay() {
			
			@Override
			public void pay() {
				System.out.println("使用网联发起支付....");
			}
		});
	}
	
	//发起支付的方法
	public static void pay1(Pay pay){
		pay.pay();
	}
	
	public static void pay(String id){
		
		//1.微信支付
		if("1".equals(id)){
			System.out.println("使用微信支付接口....");
		}
		
		//2支付宝支付
		if("2".equals(id)){
			System.out.println("使用支付宝的支付接口...");
		}
		
		//3银联支付
		if("3".equals(id)){
			System.out.println("使用银联的支付接口...");
		}
		
		
		
		
		
		
		
		
	}

}
