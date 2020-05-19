package com.ws.computer.chapter9.oneandtwo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ws.computer.chapter9.threeandfour.DivideException;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月19日下午3:04:06
 */
public class ExceptionDemo01 {
	
	
	public static void main(String[] args)throws FileNotFoundException {
		//1.编译阶段不会出现问题：javac阶段
		//ArithmeticException：算术异常
		//System.out.println(divide(3, 0));
		//System.out.println("调用divede方法之后的代码。。。。");
		//2.异常的分类：1)运行时异常：java命令阶段，运行阶段出的异常   2)编译时异常
		//3.运行时异常：在代码成面不会有任何影响，对编译不会影响。
		//4.处理异常： 1)捕获异常  2）往上抛异常（把锅往上甩，自己不处理）。
		//4.1捕获异常:try{} catch(Exception e){}
		try{
		    System.out.println(divide(3, 0));
		}catch(Exception e){
			System.out.println("catch代码快....");
			System.out.println(e.getMessage());
		}
		System.out.println("调用divede方法之后的代码。。。。");
		//5.编译时异常：肯定是在编译阶段发生的异常：	 FileNotFoundException
		try {
			InputStream in = new FileInputStream(new File(""));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		//6.ArithmeticException：算术异常，运行时异常。 FileNotFoundException:编译时异常
		//6.1继承至RuntimeException的异常类，都是运行时异常类。
		//6.2继承至Exception的类，但是不继承RuntimeException，就是编译时异常类。
		//InputStream in = new FileInputStream(new File(""));//throws:抛出异常
		//Exception e = new FileNotFoundException();
		
		//自定义异常
		try {
			divide(3,0);
		} catch (DivideException e) {
			//DivideException e = new DivideException("分母不能为0....");
			System.out.println(e.getMessage());
		}
		
		
	}
	//定义一个函数：功能就是 取 x/y的值
	public static int divide(int x , int y )throws DivideException{
		if(y == 0 )
			throw  new DivideException("分母不能为0....");
	  return x / y;// 3 / 0 值
	}

}
