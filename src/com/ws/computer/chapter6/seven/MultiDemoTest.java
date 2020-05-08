package com.ws.computer.chapter6.seven;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月8日上午11:22:51
 */
public class MultiDemoTest {
	
	public static void main(String[] args) {
		
		//1.多态：父类类型的变量引用子类类型的对象
		//多态是在继承的基础之上
		//子类类型 -> 父类类型 ： 自动类型转换  向上类型转换
		Animal animal = new Cat();//Cat cat = new Cat();
		
		
		//2.如果子类重写了父类的方法，则优先调用子类的方法。
		animal.eat();
		
		//3.如果子类没有重写父类的方法，则调用父类的方法
		animal.info();
		
		//4.调用属性的时候，调用父类，与子类没有关系。
		System.out.println(animal.age);
		
		//5.强制类型转换:父类类型 -> 子类类型 向下类型转换：强制转换。
		
		Cat cat = (Cat)animal;
		System.out.println(cat.age);
		
		//6.instanceof

         if(animal instanceof Cat){
        	 Cat cat1 = (Cat)animal;
        	 System.out.println(cat1.age);
         }
		
         if(animal instanceof Dog){
        	 Dog dog = (Dog)animal;
        	 System.out.println(dog.age);
         }
		
		
		
		
		
		//自动类型转换
		int  myInt = 10 ;
		double myDouble = myInt;
		
		//强制类型转换
		double  myDouble1 = 100;
		int a = (int)myDouble1;
		
	
	
	}

}
