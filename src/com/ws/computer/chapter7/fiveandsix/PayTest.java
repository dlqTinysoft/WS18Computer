package com.ws.computer.chapter7.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月11日上午11:31:48
 */
public class PayTest {
	
	public static void main(String[] args) {
		
		//向扣款机构发起扣款操作
		payInterface(new UnionPay());
		payInterface(new AliPay());
		payInterface(new WechatPay());
	}
	
	
	//扣款方法优化：使用多态实现多通道扣款模式。
	private static void payInterface(Pay pay){
		//发起支付
		pay.pay();
	}
    //传统的扣款模式
	private static void pay(String id) {
		
		if("1".equals(id)){
			System.out.println("向微信发起扣款...");
		}
		if("2".equals(id)){
			System.out.println("向支付宝发起扣款...");
		}
		
		if("3".equals(id)){
			System.out.println("向银联发起扣款...");
		}
		
		if("4".equals(id)){
			System.out.println("向网联发起扣款...");
		}
		
		
	}

}
