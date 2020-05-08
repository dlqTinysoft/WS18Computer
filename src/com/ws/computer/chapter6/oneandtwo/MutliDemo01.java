package com.ws.computer.chapter6.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月8日上午9:19:46
 */
public class MutliDemo01 {
	
	public static void main(String[] args) {
		
		//1.什么是多态:把子类对象的地址赋值父类
		//多态是继承基础之上的
		//自动类型转换 子类 -》 父类。 向上类型转换
		Animal animal = new Cat();// Cat cat = new Cat();
		
		//2.如果子类重写了父类的方法，则优先调用子类的方法
		//如果子类没有重写父类的方法，则调用父类的方法。
		animal.eat();
		animal.info();
		
		//3.调用属性的时候，必须是animal中的属性
		//如果animal中没有该属性，则编译不通过。和子类没有关系
		System.out.println(animal.age);
		
		//4.类型转换(强制类型转换) 向下类型转换。
		  //  父类 ->子类
		Cat cat = (Cat) animal;
		System.out.println(cat.age);
		
		//Dog dog = (Dog)animal;
		//System.out.println(dog.age);
		//5.instanceof
		if(animal instanceof Cat){
			Cat cat1 = (Cat)animal;
		}
		if(animal instanceof Dog){
			Dog dog1 = (Dog)animal;
			
		}
		
		

		//自动类型转换
		int myInt = 10 ;
		double myDouble = myInt;
		
		//强制类型转换
		double a = 100 ;
		int b = (int)a;
		
		
		
	}

}
