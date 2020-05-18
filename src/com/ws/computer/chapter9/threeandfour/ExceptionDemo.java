package com.ws.computer.chapter9.threeandfour;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日下午3:11:35
 * 
 * 1.java里面的异常：Exception
 * 
 * 
 */
public class ExceptionDemo {
	
	
	public static void main(String[] args) throws Exception {
		
		//double result = divide(3, 0);
		//1.javac阶段：编译阶段   2.java阶段：运行阶段
		//System.out.println(result);
		
		//System.out.println("异常之后的代码");
		//ArithmeticException
		//2.java中的异常可以分为两种：1)RuntimeException：运行时异常 2.非RuntimeException:编译时异常。
		//运行时异常：继承至RuntimeException这个类的异常，都叫做运行时异常。
		//编译时异常：直接继承至Excepiton的异常类为编译器异常。
		
		//3.怎么解决异常？  1）捕获异常，自己处理   2）抛出去。
		
		//3.1捕获异常： try {} catch(Exception e){}
		try {
			InputStream in = new FileInputStream(new File(""));
		} catch (Exception e) {
			//处理异常
			System.out.println(e.getMessage());
		}
		
		//3.2.抛出异常： throws;
		
		//3.3写代码规范：异常能自己处理就自己处理，不要随意的throws出去
		
		InputStream in1 = new FileInputStream(new File(""));
		
		System.out.println("异常之后的代码。。。。。");
		
	}
	
	
	
	//求两个数的商 。 两个数相除。
	public static double divide(int x , int y ){
		double result = x / y ;// 3/0
		return result;
		
	}

}
