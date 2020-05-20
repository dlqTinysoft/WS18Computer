package com.ws.computer.chapter10.fixeandsix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日上午8:52:13
 */
public class ExceptionDemo01 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		//1.异常分为两类：1)运行时异常：RuntimeException的子类
		//             2）编译时异常：不是RuntimeException的子类，是Exception的子类
		
		//2.异常处理。编译时必须 处理：就是代码干预。 运行时异常可以不处理，编译不会出问题，就是运行时程序会中断
		//2.1 捕获异常： try{} catch(Excepiton e ){}
		//2.2 往上抛出异常  throws 放在形参列表之后   throw :运用在方法体里面的
		
		try {
			InputStream in = new FileInputStream(new File(""));
		} catch (FileNotFoundException e) {
			//有异常的时候才执行catch代码快里面的代码。。。
		}finally {
			//不管有没有异常，finally里面的代码快都会执行。。。
		}
		InputStream in = new FileInputStream(new File(""));
		
	}

}
