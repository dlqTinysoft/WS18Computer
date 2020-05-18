package com.ws.computer.chapter9;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日上午10:13:38
 */
public class ExceptionDemo03 {
	
	public static void main(String[] args) {
		
		try {
			double result =  divide(3, 0);
		}catch(Exception e){
			System.out.println(e.getMessage());
		} finally {
			//2.不管是否发生异常，finally代码快一定会执行的。
			System.out.println("finally代码快....");
		}
		
		
	}
	
	
	
	
	public  static  double divide(int x, int y ){
		double result = x / y ;
		return result;
	}
	

}
