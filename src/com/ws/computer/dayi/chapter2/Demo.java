/**
 * 
 */
package com.ws.computer.dayi.chapter2;

import java.util.Arrays;

/**
 * @author 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 2020年4月13日下午3:47:07
 */
public class Demo {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.age = 26;
		p.name = "dlq";
		p.height = 182;
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.height);
		p.eat();
		p.sport();
		p.study();
	}

}
