package com.ws.computer.chapter9.sevenandeight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日下午4:16:58
 * 
 * 1.异常: 
 */
public class ExceptionTest {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//1.异常：1)编译时异常   2）运行时异常
		//ArithmeticException
		//divide(3, 0);
		//FileNotFoundException
		//2.运行时异常不用处理可以编译通过，但是运行的时候会导致程序出现异常。 编译时异常，在编译的时候必须处理，否则编译不通过
		//InputStream in = new FileInputStream(new File(""));
		
		//3.怎么区分一个异常类是编译异常类还是运行时异常类
		//3.1运行时异常：只要是RuntimeException的子类，则都是运行时异常。
		//3.2编译时异常：一个类继承至Exception，但是不属于RuntimeException的子类，则该异常类为编译时异常类。
		
		//4.怎么处理异常：  4.1捕获异常：try{}catch(Exception e ) {} 
		//4.2：抛异常：throws关键字，也可以用throw关键字
		try {
			InputStream in = new FileInputStream(new File(""));
		} catch (FileNotFoundException e) {
			//如果发生异常就会执行catch代码快中的代码
			System.out.println("catch代码快......");
		}finally {
			//不管有没有发生异常，finally代码都会执行。
			System.out.println("finally代码快....");
		}
		
		//4.2抛异常：throws关键字
		//InputStream in = new FileInputStream(new File(""));
		
		//5.自定义异常： 自定义一个编译时异常。
		//throws  和  throw 她两的区别
		try {
			divide(3, 5);
		} catch (DivideException e) {
			//DivideException e = new DivideException("分母不能为0.....")
			System.out.println(e.getMessage());
		}
	}
	
	//两个数相除
	public static double divide(int x , int y ) throws DivideException{
		
		if( y == 0 )
			//抛出异常
			throw new DivideException("分母不能为0.....");
		double result = x / y ;
		return result;
		
	}

}
