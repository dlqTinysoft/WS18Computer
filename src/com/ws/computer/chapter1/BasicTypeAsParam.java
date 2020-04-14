package com.ws.computer.chapter1;
/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 单位：武汉生物工程学院
 * 基本类型作为参数传递
 */
public class BasicTypeAsParam {
	
	public static void main(String[] args) {
		int a = 3 ;
		int b = 4 ;
		methodA(3,4);
		System.out.println(a);
		System.out.println(b);
	}
    //形参为基本数据类型
	private static void methodA(int a, int b) {
		a = 5 ;
		b = 6 ;
	}
}
