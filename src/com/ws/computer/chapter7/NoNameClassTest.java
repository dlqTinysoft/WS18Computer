package com.ws.computer.chapter7;

import com.ws.computer.chapter5.seven.Animal;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午1:35:00
 * 匿名内部类，就是没有名字的类
 */
public class NoNameClassTest {
	
	
	public static void main(String[] args) {
		
		method(new Animal(){
			
		});
	}
	
	public static void method(Animal animal){
		animal.eat();
	}

}
