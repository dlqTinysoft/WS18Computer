package com.ws.computer.chapter9;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日上午10:03:15
 */
public class ExceptionDemo02 {
	
	public static void main(String[] args) {
		//1.使用try-catch代码快 来解决异常
		try{
		   divide(3,0);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("try catch后面的代码快...");
	}
	
	
	
	public static double divide(int x , int y ){
		
		return x / y ;
	}

}
