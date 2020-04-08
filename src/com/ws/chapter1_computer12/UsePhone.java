package com.ws.chapter1_computer12;

public class UsePhone {
	
	public static void main(String[] args) {
		//Phone p1:就是引用类型的变量
		//Phone p1  ;  int age ; 基本类型 和引用类型
		Phone p1 = new Phone();
		Phone p12= new Phone();
		System.out.println(p1.brand);
		System.out.println(p1.price);
		p1.info();
		p1.info();
		p1.info();
		p1.info();
	}
}
