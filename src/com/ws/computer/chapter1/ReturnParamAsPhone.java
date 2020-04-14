package com.ws.computer.chapter1;
/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 单位：武汉生物工程学院
 * 引用作为参数传递
 */
public class ReturnParamAsPhone {
     public static void main(String[] args) {
		Phone p1 = getPhone();
		//打印引用所指向对象的值
		System.out.println(p1.brand);
		System.out.println(p1.price);
	}
    //返回引用类型 
	private static Phone getPhone() {
		//new一个Phone对象
		Phone phone = new Phone();
		//赋值
		phone.brand = "华为";
		phone.price = 4999;
		//返回
		return phone;
	}
}
