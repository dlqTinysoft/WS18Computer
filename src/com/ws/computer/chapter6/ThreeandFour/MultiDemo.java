package com.ws.computer.chapter6.ThreeandFour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日上午11:15:41
 * 
 * 面向对象三大特性：封装  继承  多态
 */
public class MultiDemo {
	
	public static void main(String[] args) {
		 //1.多态的定义：子类new的对象的地址,赋值给父类类型的引用变量
		//自动类型转换：子类对象 -> 父类类型
		 Animal animal = new Cat();  // Cat cat = new  Cat();
		
		 //2.如果子类重写父类的方法，那么优先调用子类重写的方法。
		 animal.eat();
		 animal.run();
		 //3.anima只能调用子类中重写父类的方法，子类独有的方法，不能调用
		 //编译就通不过。
		 //animal.methodCat();
		 
		 //4.要想调用子类的独有方法和独有属性，
		 //那么必须讲父类类型强制转换为子类类型
		 //强制类型转换 ：父类类型  -> 子类类型
		 Cat cat = (Cat) animal;
		 cat.run();
		 System.out.println(cat.age);
		 
		 //5.父类类型的引用变量，可以访问父类中的独有方法和独有属性。
		 animal.methodAnimal();
		 
		 //6.instanceof的使用
		 if(animal instanceof  Dog){
			 Dog dog = (Dog) animal;
			 dog.run();
		 }
		 
		 if(animal instanceof  Cat){
			 Cat cat1 = (Cat) animal;
			 cat1.run();
		 }

		 
		
	}
	
	
	
	

}
