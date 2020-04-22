package com.ws.computer.chapter3;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月21日下午3:08:31
 */
public class OverLoadTest {
	
	//两同前提条件： 1.在一个类中 ， 2.方法名必须相同。
	//一个不同： 形参列表不同: 1.形参的类型不同， 2.形参个数不同
	
	public void getAdd(int number){
		System.out.println(number);
	}
	
	public void getAdd(double arr){
		
	}
	
	public int getInfo(int number, double number1){
		
		return 1; 
	}
	
	public void getInfo(int number){
		
	}
	
	

	
}
