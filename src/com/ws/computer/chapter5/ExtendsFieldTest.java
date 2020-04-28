package com.ws.computer.chapter5;

/**
 * 作者： 董乐强 邮箱：dlq_tinysoft@163.com 时间：2020年4月28日上午10:58:40
 *  继承父类的成员变量知识点
 * 在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式： 
 * 1. 直接通过子类对象访问成员变量：等号左边是谁，就优先用谁，没有则向上找。
 * 2.间接通过成员方法访问成员变量：该方法属于谁，就优先用谁，没有则向上找。
 * 3.super和this对属性的使用
 */
public class ExtendsFieldTest {
	public static void main(String[] args) {

		Zi zi = new Zi();
		zi.methodZi();
		Fu fu = new Fu();
		
		
		
	}
}
