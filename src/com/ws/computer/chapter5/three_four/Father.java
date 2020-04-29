package com.ws.computer.chapter5.three_four;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日上午11:07:53
 */
public  class Father {
	
	private String name ;
	private int age;
	
	public final int num = 100 ;
	
	final int numFinal = 1000;
	
	public int numz = 20 ;
	
	public void method(){
		System.out.println("父类method");
	}
	
	//支付方法
   public  void info(){
	  
   }
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
