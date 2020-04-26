package com.ws.computer.chapter4;


/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月26日上午10:57:21
 */
public class CarTest {
	
	public static void main(String[] args) {
		//访问我们的静态变量
		System.out.println(Car.name);
		//1.类名.变量名(属性)
		Car.name = "宝马x6";
		System.out.println(Car.name);
		
		//2. car = new Car(); car.name;
		Car car = new Car();
		System.out.println(car.name);
		
		Car car1 = new Car();
		System.out.println(car1.name);
		
		Car car2 = new Car();
		System.out.println(car2.name);
	   //===============
		car1.setBrand("宝马x1");
		
		System.out.println(car2.getBrand());
		
		//============static 修饰方法===========
		
		//1. Car.方法名
		 Car.method();
		 Car car3 = new Car();
		 car3.method();//不太推荐
		 
	//=======================static修饰的方法是静态方法
    //静态方法里面 不能调用非静态方法
		//method();
   // 非静态方法，里面能调用静态方法吗？:可以的
		 
		 
	//静态代码快
	}
	
	public  static void staticMethod(){
		System.out.println("我的静态方法");
	}
	
	public  void method(){
		staticMethod();
		System.out.println("hello wrold");
	}
	
	
	
	
	

}
