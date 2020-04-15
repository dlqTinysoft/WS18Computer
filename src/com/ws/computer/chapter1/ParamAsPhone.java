package com.ws.computer.chapter1;
/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 单位：武汉生物工程学院
 * 引用作为参数传递
 */
public class ParamAsPhone {
	
	public static void main(String[] args) {
		Phone p1 = new Phone();
		System.out.println(p1);
		p1.brand = "苹果手机";
		p1.price = 7999;
		
		String[] strs = {"abc"};
		//new String[1]; strs[0] = "abc"
		//func(p1);
		System.out.println(p1.brand);
		System.out.println(p1.price);
		int a = 5 ;
		int b = 6 ;
		b = func1(a,b);
		System.out.println(a);
		System.out.println(b);
	}
	
    private static int func1(int a , int  b) {
		// TODO Auto-generated method stub
    	a = a+ b;
        b = a+ b;
        
        return b;
		
	}

	//方法的形参为引用类型
	//定义一个方法，方法形参 都是基本数据类 
	//引用类型 phone = 0x112233
	public static void func(Phone phone, int param ) {
		//赋值
		phone.brand = "华为";
		phone.price = 4999;
	}
}
