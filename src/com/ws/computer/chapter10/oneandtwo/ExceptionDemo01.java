package com.ws.computer.chapter10.oneandtwo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月22日上午8:51:30
 * 
 * 异常复习
 */
public class ExceptionDemo01 {
	
	
	public static void main(String[] args) throws DivideException {
		
		//1.异常的分类：  编译时异常 和运行时异常
		//编译时异常：继承至Exception，也就是Exception的子类，但不是RuntimeException的子类
		//FileNotFoundException编译时异常
		//运行时异常：这个异常类是RuntimeException的子类 NullPointerException,CasecastException
		//2.异常解决方式： 捕获异常，try{}catch(Excepiton e){}  和  抛出异常  throws、throw
		try {
			InputStream in = new FileInputStream(new File(""));
		} catch (FileNotFoundException e) {
			//如果出现异常就会执行catch快里面的语句
		}finally {
			//不管有没有发生异常，finally代码快都会执行。
		}
		
		divide(3, 0);

	}
	
	//throws 和  throw的区别
	public  static  double divide(int x , int y ) throws DivideException{
		
		if(y == 0 )
			throw new DivideException("分母不能为0....");
		
		return x / y;
	}
	
	
	
	
	
	
	
	
	
	
	

}
