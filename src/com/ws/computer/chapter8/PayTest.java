
package com.ws.computer.chapter8;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日上午10:58:57
 * Lambda表达讲解
 */
public class PayTest {
	
	
	public static void main(String[] args) {
		Pay pay = new AliPay();
		//发起扣款操作
		payT(pay);
		//匿名内部类的模式
		payT(new Pay() {
			@Override
			public void pay() {
				System.out.println("向微信发起支付....");
			}
		});
		
		payT(()->{
			System.out.println("向银联发起扣款操作...");
		});
	}
	private static void payT(Pay pay){
		pay.pay();
	}

}
