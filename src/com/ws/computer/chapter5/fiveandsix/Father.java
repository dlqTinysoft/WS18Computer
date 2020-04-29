package com.ws.computer.chapter5.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日上午9:00:49
 */
public   class Father {
	
	public int num = 1000;
	
	final int numFu = 100 ;
	
	
	
	private String name;
	private int age;
	
	public String info = "李四爸爸 ";
	
	public String password = "ABC";
	
	
	public  void info(){
		System.out.println("父类");
	}
	
	
	
	
	
	
	
	
	
	
	
	public void printInfo(){
		System.out.println("父类");
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
