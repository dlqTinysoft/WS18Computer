package com.ws.chapter2;
/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 单位：武汉生物工程学院
 * 局部变量 vs 成员变量
 * 1)定义的位置不一样【重点】
 *       局部变量：在方法的内部
 *       成员变量：在方法的外部，直接写在类当中
 * 2)作用范围不一样【重点】
 *       局部变量：只有方法当中才可以使用，出了方法就不能再用
 *       成员变量：整个类全都可以通用。
 * 3)默认值不一样【重点】
 *       局部变量：没有默认值，如果要想使用，必须手动进行赋值
 *       成员变量：如果没有赋值，会有默认值，规则和数组一样
 * 4)内存的位置不一样（了解）
 *       局部变量：位于栈内存
 *       成员变量：位于堆内存
 * 5)生命周期不一样（了解）
 *       局部变量：随着方法进栈而诞生，随着方法出栈而消失
 *       成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失
 */
public class VariableDifference {
	//成员变量
	public static String name;
	public static void main(String[] args) {
		//1.局部变量在方法内部，成员变量在方法外部
		//2.局部变量：只有方法当中才可以使用，出了方法就不能再用
		//成员变量：整个类全都可以通用。
		//3.局部变量：没有默认值，如果要想使用，必须手动进行赋值
		//  成员变量：如果没有赋值，会有默认值，规则和数组一样
		int age = 0 ;
		System.out.println(age);
		System.out.println(name);
		Cat c = new Cat();
		methodA(1.25);
		System.out.println(c);
		//4.局部变量：位于栈内存，成员变量：位于堆内存
		//5. 局部变量：随着方法进栈而诞生，随着方法出栈而消失
		//成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失
		
	}
	public static void methodA(double param1){
		//局部变量
		float price = 90.23f ;
		int age = 26;
		System.out.println(price);
		System.out.println(age);
	}
}
