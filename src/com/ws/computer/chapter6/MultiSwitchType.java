package com.ws.computer.chapter6;

/**
 * 作者： 董乐强 
 * 邮箱：dlq_tinysoft@163.com 
 * 时间：2020年5月6日上午7:21:38
 * 向上转型一定是安全的，没有问题的，正确的。
 * 但是也有一个弊端： 对象一旦向上转型为父类，那么就无法调用子类原本特有的内容。
 * 解决方案：用对象的向下转型【还原】。
 */
public class MultiSwitchType {
	
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.eat();
		Cat cat = (Cat)animal;
		
		System.out.println(animal);
		System.out.println(cat);
		cat.catMethod();
		//错误写法:new出来的是猫，非要把当成狗 。
		//Dog dog = (Dog)animal;
	}

}
