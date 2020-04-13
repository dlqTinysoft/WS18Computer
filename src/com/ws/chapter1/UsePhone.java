package com.ws.chapter1;
/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 单位：武汉生物工程学院
 * 定义手机类
 */
public class UsePhone {
	public static void main(String[] args) {
		//1.Phone p1:定义引用类型变量p1
		//2.new Phone():实例化对象（申请内存空间）
		Phone p1 = new Phone();
		//打印成员变量
		System.out.println(p1.brand);
		System.out.println(p1.price);
		//给成员变量赋值
		p1.brand = "华为p30";
		p1.price = 4999;
		//再次打印成员变量
		System.out.println(p1.brand);
		System.out.println(p1.price);
		//调用成员方法
        p1.info();
        //Phone p2 定义的引用类型变量
        //int age;
        //Phone p2
        Phone p2 = new Phone();
        p2.brand = "苹果11";
        p2.price = 7999;
        p2.info(); 
        
	}
}
