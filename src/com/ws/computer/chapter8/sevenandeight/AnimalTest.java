package com.ws.computer.chapter8.sevenandeight;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月15日上午11:16:43
 */
public class AnimalTest {
	
	
	
	public static void main(String[] args) {
		//1.多态
		Animal animal = new  Cat();
		method(animal);
		
		//2.匿名内部类
		//2.1匿名对象
		method(new Animal() {
			
			@Override
			public void run() {
				System.out.println("匿名内部类方法...");
			}
		});
		
		//lambda表达式是jdk8的新特性
		//lambda可以取代匿名内部类的写法
		
		//3.函数式接口：这个接口中有且仅有一个抽象方法。
		
		method(()->{
			System.out.println("lambda表达方法执行。。。。");
		});
		
		//3.1函数式接口：带返回类型和有参的lambda表达式写法
		
		methodS(10,new Student() {
			
			@Override
			public boolean isFlag(int number) {
				if(number == 10 )
					return true;
				return false;
			}
		});
		
		//lambda表达式写法
		methodS(10, (int number)->{
			System.out.println("执行lambda表达式....");
			if(number == 10 )
				return true;
			return false;
		});
		
		
	}

	private static void methodS(int number , Student stu) {
		//优先调用子类重写的方法。。
	   System.out.println(stu.isFlag(number));
	}
	
	

	private static void method(Animal animal) {
		//优先调用子类重写的方法。。
		animal.run();
	}
	
	

}
