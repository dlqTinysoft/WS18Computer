package com.ws.computer.chapter3;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月22日上午10:59:40
 */
public class Dog {
	//权限控制符：四个：private，public
	private String name;
	private int age;
	
	
	//重载：两个相同： 1.在一类中， 2.方法名必须相同 。
	//1个不同：形参列表不同：1.参数类型不一样，2.参数个数不一样
	public void run(String name){
		
	}
	
	public void run(){
		
	}
	
	public void run(String name , int age){
		
	}
	
	//
	public  int getA(){
		return 1;
	}
	
	public void getA(String name){
		
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
