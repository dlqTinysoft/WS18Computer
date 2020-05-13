package com.ws.computer.chapter8.threeanddfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午11:15:07
 * 4.匿名内部类（重点）
 */
public class NoNameClassTest {
	
	
	
	public static void main(String[] args) {
		
		//多态
		//1.第一种方式的调用
		Pay pay = new AliPay();
		//method(pay);
		
		//2.匿名对象
		//method(new AliPay());
		
		//3.匿名内部类写法:android的应用层开发里面经常出现
		method(new Pay() {
			@Override
			public void pay() {
				System.out.println("匿名内部方法被调用....");
			}
		});
		
		//lambda表达式
		//4.1 函数式接口：这个接口中有且仅有一个抽象方法，那么就把这个接口叫做函数式接口。
		method(()->{
			System.out.println("使用labmda表达式的写法....");
		});
		
		//5.
		methodToLadmba(2, new Number() {
			
			@Override
			public boolean isFlag(int myInt) {
				if(myInt == 1 )
					return true;
				return false;
			}
		});
		
		
		//6.lambda表达式来写
		System.out.println("============");
		methodToLadmba(2, (int myInt)->{
			
			System.out.println("我是ladmbda表达式....");
			if(myInt == 1 )
				return true;
			return false;
		});
		
		
	}
	
	
	public static void methodToLadmba(int myInt , Number number){
		boolean flag = number.isFlag(myInt);
		System.out.println(flag);
	}
	
	public static void method(Pay pay){
		pay.pay();
	}

}
