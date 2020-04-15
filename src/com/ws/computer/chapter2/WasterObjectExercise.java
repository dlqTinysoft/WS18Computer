package com.ws.computer.chapter2;


/**
 * @author 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月15日上午10:32:55
 * 垃圾对象练习题
 */
public class WasterObjectExercise {
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.age = 2;
		c.name = "小小猫";
		c = null;
		methodA();
		
		c = new Cat();
		mthodB(c);
		System.out.println("程序执行结束");
	}

	
	private static void mthodB(Cat c) {
		c = null;
	}

	
	private static void methodA() {
		Cat c = new Cat();
		c.age = 1 ;
		c.name = "小可爱";
	}

}
