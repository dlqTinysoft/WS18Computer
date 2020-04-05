package com.ws.chapter1;
/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 单位：武汉生物工程学院
 * 定义手机类
 */
public class Phone {
	//品牌(成员变量)
	public String brand;
	//价格(成员变量)
	public float price;
	//打印手机信息(成员方法)
	public void info(){
		System.out.println("手机品牌： "+brand+" 手机价格："+price);
	}
}
