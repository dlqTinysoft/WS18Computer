package com.ws.computer.chapter2;
/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月12日下午10:12:09
 */
public class Exercise {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		methodA(cat);
		System.out.println(cat.age);
		System.out.println(cat.name);
	}

	/**
	 * @param cat
	 */
	private static void methodA(Cat cat) {
		cat.age = 2;
		cat.name = "小黑猫";
	}

}
