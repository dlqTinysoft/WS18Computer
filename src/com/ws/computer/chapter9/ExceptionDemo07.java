package com.ws.computer.chapter9;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日上午10:27:11
 * 6.自定义异常
 */
public class ExceptionDemo07 {
	
	
	public static void main(String[] args) {
		try {
			divide(3 , 0 );
		} catch (DivideException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static double divide(int x , int y ) throws DivideException{
		if(y == 0 )
			throw new DivideException("分母不能为0...");
		return x / y;
	}
	
	

}
