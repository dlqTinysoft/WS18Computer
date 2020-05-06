package com.ws.computer.chapter5.seven;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日下午4:16:52
 * java中的继承是单继承的
 */
public class Cat extends Animal {
	
	
	//1.继承。 Cat类继承Animal类
	//2.Cat类叫做子类， Animal叫父类
	
	//3.Cat类可以继承Animal的属性
	
	//4.Cat类可以继承Animal类的方法
	
	//5.方法的重写:子类对父类方法的重写
	//方法名相同，形参列表相同
	//重写  vs 重载
	public void eat(){
		System.out.println("Cat喜欢吃鱼...");
	}
	
	public int age = 10 ;
	
	//6.将super关键字
	private String name;
	
	public void info(){
		//获取父类的name属性值 
		System.out.println(super.name);
		//获取当前类的name属性值
		System.out.println(this.name);
	}
	
	public void method(){
		//调用本类的eat()方法，也叫子类的eat()方法
		this.eat();
		//必须调用父类的eat()方法
		super.eat();
	}
	
    //7.构造方法的调用:new子类的实列，
	//先调用父类的构造方法，在调用子类的构造方法.
	
	public Cat(){
		System.out.println("子类(Cat)的构造方法。。。。");
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}
