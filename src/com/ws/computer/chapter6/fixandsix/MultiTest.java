package com.ws.computer.chapter6.fixandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日上午9:14:41
 */
public class MultiTest {
	
	public static void main(String[] args) {
		   //父类类型的变量引用子类类型的对象
		  //就是多态：new的对象时子类，定义的引用变量是父类
		  //自动类型转换，向上类型转换
		  Animal animal = new Cat();
		  //1.调用子类里面重写的方法
		  animal.eat();
		  
		  //2.子类重写父类的方法：调用优先调用子类的方法。
		  animal.info();
		  
		  //3.父类类型的引用变量，无法调用子类里面的非重写方法。
		  //animal.run();
		  
		  //4.要进行类型转换（强制类型转换）
		  //把父类类型转换为子类类型（向下类型转换）
		  //注意：父类类型强制为子类类型，
		  //那么就可以拿强制的子类类型调用子类独有的方法
		  Cat cat = (Cat) animal;
		  cat.run();
		  
		  //5,instanceof
		  //5.1自动类型转换
		  Animal  animal1 = new Dog();
		  //5.2强制类型转换
		  //Cat cat1 = (Cat) animal1;
		  //cat1.run();
		  if(animal1 instanceof Cat){
			  Cat  cat1 = (Cat) animal1;
			  cat1.run();
		  }
		  
		  if(animal1 instanceof Dog){
			  Dog dog = (Dog) animal1;
		  }
		  
		  //
		  //Cat cat = new Cat();
	}

}
