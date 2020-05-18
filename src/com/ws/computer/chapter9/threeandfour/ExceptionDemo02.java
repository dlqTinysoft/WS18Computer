package com.ws.computer.chapter9.threeandfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日下午3:43:18
 */
public class ExceptionDemo02 {
	
	//1.自动义异常
	
	
	public static void main(String[] args) throws DivideException {
		try {
			divide(3, 0);
		} catch (DivideException e) { //DivideException e = new DivideException("分母不能为0");
			
			System.out.println(e.getMessage());
		}
		
		divide(3,0);
	}
	
	
	public static double  divide(int x, int y ) throws DivideException{
		
		if(y == 0 )
			//往外仍异常
			throw new DivideException("分母不能为0");
		
		return  x / y ;
		
	}

}
