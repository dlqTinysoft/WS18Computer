package com.ws.computer.chapter9;

import java.io.IOException;

import javax.management.RuntimeErrorException;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日上午10:21:28
 * 5.使用throw关键字抛出异常。
 */
public class ExceptionDemo05 {
	
	public static void main(String[] args) {
		method();
		
		
	}
	
	
	public  static void method(){
		//抛出运行时异常
		throw new RuntimeException("运行时异常....");
		
	}
	//抛出编译时异常
	public static void  methodA() throws Exception{
		throw new IOException("io异常...");
	}

}
