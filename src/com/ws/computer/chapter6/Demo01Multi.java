package com.ws.computer.chapter6;

/**
 * 作者： 董乐强
 *  邮箱：dlq_tinysoft@163.com 
 * 时间：2020年5月6日上午7:03:12
 * 代码当中体现多态性，其实就是一句话：父类引用指向子类对象。
 *  格式：1. 父类名称 对象名 = new 子类名称(); 
 *  或者： 2. 接口名称 对象名 = new 实现类名称();
 * 
 */
public class Demo01Multi {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
		Animal anima11 = new Cat();
		anima11.eat();
	}

}
