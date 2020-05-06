package com.ws.computer.chapter6;

/**
 * 作者： 董乐强
 *  邮箱：dlq_tinysoft@163.com 
 *  时间：2020年5月6日上午7:26:19
 * 如何才能知道一个父类引用的对象，本来是什么子类？
 *  格式： 对象 instanceof 类名称
 *     这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class InstanceofDemo {
	
	public static void main(String[] args) {
		Animal animal = new Dog();
		
		if(animal instanceof Dog){
			Dog dog = (Dog) animal;
			dog.eat();
		}
	}

}
