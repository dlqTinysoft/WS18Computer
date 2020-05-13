package com.ws.computer.chapter8;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午9:23:14
 * 
 * 5.lambda表达
 *    1.函数式接口：一个接口有且只有一个抽象方法，那么该接口被称为函数式接口
 */
public class LambdaTest {
	
	
	public static void main(String[] args) {
		payT(new AliPay());
		
		payT(new Pay() {
			
			@Override
			public void pay() {
				System.out.println("匿名内部类 ");
			}
		});
		
		
		//lambda表达式
		
		payT(()->{
			System.out.println("lambda表达式");
		});
		
	}
	
	
	
	private static void payT(Pay pay){
		pay.pay();
	}

}
