package com.ws.computer.chapter2;



/**
 * @author 董乐强 
 * 邮箱：dlq_tinysoft@163.com 
 * 时间：2020年4月11日下午10:06:24
 *  垃圾对象的定义：当没有任何变量引用对象时，该对象将成为垃圾对象。不能在被使用 
 *  导致垃圾对象的两种情况： 
 *  1.对象的引用了超出了作用域
 *  2.对象的引用重新指向空
 */
public class WasteObject {
	public static void main(String[] args) {
		// 1.对象的引用超出了作用域，该对象成为了垃圾对象
		getCat();
		//2.对象的引用重新指向为空
		Cat c = new Cat();
		c.name = "小黑猫";
		c.age = 2;
		c = null;
	}
	// 垃圾对象：该方法释放后，没有引用指向new Phone()
	private static void getCat() {
		Cat c = new Cat();
		c.name = "小黄猫";
		c.age = 3 ;
	}
}
