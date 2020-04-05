package com.ws.chapter1;
/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 单位：武汉生物工程学院
 * 局部变量 vs 成员变量
 */
public class VariableDifference {
	
	//成员变量
	public String name;
	
	public void methodA(double param1){
		//局部变量
		float price = 90.23f ;
		System.out.println(price);
	}

}
