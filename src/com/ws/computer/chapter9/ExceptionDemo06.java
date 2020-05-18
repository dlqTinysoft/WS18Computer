package com.ws.computer.chapter9;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日上午10:25:06
 */
public class ExceptionDemo06 {
	
	
	
	public static void printAge(int age) throws Exception{
		
		if(age <= 0 )
			throw new Exception("age输入不合法....");
		else
			System.out.println(age);
		
		
	}

}
