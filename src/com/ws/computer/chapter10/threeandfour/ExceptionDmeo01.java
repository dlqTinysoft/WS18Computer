package com.ws.computer.chapter10.threeandfour;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日上午10:56:05
 */
public class ExceptionDmeo01 {
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		//1.异常的分类：  1)运行时异常：RuntimeException以及RuntimeException的子类都是运行时异常
		//2)编译时异常：不继承RuntimeException但是继承Exception的类是编译时异常类
		//2.怎么解决异常： 1)异常捕获：try{}catch(Exception e ){} 2)throws 关键字抛出异常
		try {
			InputStream in = new FileInputStream(new File(""));
		} catch (FileNotFoundException e) {
			//如果出现异常，就会执行catch代码快
		}finally {
			//不管有没有异常，finally代码快都会执行。
		}
		InputStream in = new FileInputStream(new File(""));
	}
	
	//自定义异常
	public static double divide(int x, int y ) throws DivideException{
		
		if( y == 0 )
			throw new DivideException("分母不能为0");
		return x / y; 
		
	}
	
	

}
