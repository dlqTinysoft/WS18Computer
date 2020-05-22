package com.ws.computer.chapter10.seveandeight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月22日上午10:56:51
 * 异常复习
 */
public class ExceptionDemo {
	
	public static void main(String[] args) throws DivideException {
		
		
		//1.异常的分类：  运行时异常  和编译时异常
		//运行时异常：RuntimeException的子类都是运行时异常类： 
		//NullPointerException ClassCastException 
		//ArithmeticException IndexOutOfBoundsException
		//编译时异常：Exception的子类，但不是RuntimeException的子类
		//FileNotFoundException IOException LoadException
		
		//2.怎样解决异常：  1.捕获异常  try{}catch(Exception){} 2.抛出异常：throw throws
		
		
		try {
			InputStream in = new FileInputStream(new File(""));
		} catch (FileNotFoundException e) {
			//如果出现异常，就会执行catch快里面的代码
		}finally {
			//不管有没有异常，finally里面的代码都会执行。
		}
		
		//throw 和throws的区别
		divide(3, 0);
	}
	
	public static double  divide(int x , int y ) throws DivideException{
		
		if(y == 0 )
			throw new DivideException("分母不能为0");
		
		return  x / y ;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
