package com.ws.computer.chapter9;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日上午10:17:20
 * 
 * 4.抛出异常 throws关键字
 */
public class ExceptionDemo04 {
	
	public static void main(String[] args) throws Exception {
		//必须处理异常
		divide(3, 0);
	}
	
	
	public  static double divide(int x , int y ) throws Exception{
		
		return x / y ;
	}

}
