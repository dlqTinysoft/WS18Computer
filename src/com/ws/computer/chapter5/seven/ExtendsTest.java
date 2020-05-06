package com.ws.computer.chapter5.seven;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日下午4:19:15
 */
public class ExtendsTest {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		//子类访问父类的属性
		//System.out.println(cat.age);
		
		//子类可以继承父类的方法
		//注意：如果子类有eat()方法，那么优先调用子类的方法
		//如果子类没有eat()方法，才去找父类的eat()方法。
		cat.eat();
		
		//属性的继承：先找子类的age，如果子类有就用子类
		//如果子类没有age这个属性，就去父类找age
		//先找子类，在找父类
		System.out.println(cat.age);
		
		cat.setName("小白猫");
		cat.info();
		
		cat.method();
		
		
		
		
	}
	
	
	

}
