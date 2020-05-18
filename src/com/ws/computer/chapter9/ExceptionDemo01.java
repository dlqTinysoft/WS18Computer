package com.ws.computer.chapter9;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日上午9:52:28
 * 1.异常捕获
 */
public class ExceptionDemo01 {
	
	public static void main(String[] args) {
		System.out.println(divide(3, 0));
	}

	
	public static double divide(int x , int y ){
		
		return  x / y ;
	}
	

}
