package com.ws.computer.chapter7;

import com.ws.computer.chapter7.StaticInnerClass.Inner;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午1:26:47
 * 静态内部类
 */
public class StaticInnerClass {
	
	static  int  m = 10 ;
	
	int n = 100 ;
	
	static class Inner{
		
		void show(){
			System.out.println("访问外部内的静态变量"+m);
		}
	}

	

}
