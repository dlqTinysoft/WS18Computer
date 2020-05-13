package com.ws.computer.chapter8.threeanddfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午11:10:45
 */
public class StaticTest {
	
	public static void main(String[] args) {
		
		//new出静态内部类的对象
		StaticC.Inner inner = new StaticC.Inner();
		inner.show();//调用静态内部类的方法
		
		
		
		
	}

}
