package com.ws.chapter1_computer12;

public class PhoneAsParam {
	
	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		System.out.println(p.brand);
		System.out.println(p.price);
		
		func(p);
		
		System.out.println(p.brand);
		System.out.println(p.price);
		
		
	}
	
	//方法的形参是引用类型
	public static void func(Phone p1){
		p1.brand = "华为p30";
		p1.price = 4999;
	}

}
