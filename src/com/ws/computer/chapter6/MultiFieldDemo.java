package com.ws.computer.chapter6;

/**
 * 作者： 董乐强
 *  邮箱：dlq_tinysoft@163.com
 *   时间：2020年5月6日上午7:10:33
 * 
 * 访问成员变量的两种方式： 1. 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
 *  2.间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
 */
public class MultiFieldDemo {

	public static void main(String[] args) {
		Fu object = new Zi();
		System.out.println(object.num);
		//System.out.println(object.age);
		object.showNum();
		
	}
}
