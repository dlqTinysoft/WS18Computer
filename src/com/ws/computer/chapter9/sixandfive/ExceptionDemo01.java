package com.ws.computer.chapter9.sixandfive;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月18日上午11:06:13
 * 1.异常
 */
public class ExceptionDemo01 {
	
	
	
	public static void main(String[] args) {
		
		//1.java里面有两个阶段： 1)javac阶段：编译阶段   2)java命令：运行阶段
		//System.out.println(divide(3,0));
		//2.异常分类：1) 编译时异常    2)运行时异常
		//System.out.println("异常之后的代码....");
		//3.java提出了一个概念：异常捕获
		try{
			//System.out.println(divide(3, 0));
		}catch(Exception e){
			//捕获后的异常信息在catch快里面。
			//System.out.println(e.getMessage());
		}
		
		//System.out.println("异常之后的语句....");
		//4.异常的分类： 1)所有的异常类多继承至Exception类。
		//2)RuntimeException的子类都叫做运行时异常类  
		//3）继承至Exception，但不是RuntimeException的子类叫做编译时异常类
		//ArithmeticException运行时异常类
		
		
		//5.抛出异常使用throws关键字
		
			//divideMethod(3, 0);
			
	   //6.编译时异常
		try {
			divideMethod(3,0);
		} catch (DivideException e) {
			//DivedeException e = new DivideException("分母不能为0);
			System.out.println(e.getMessage());
		}
			
		
		
	}
	
	public static double divideMethod(int x , int y )throws DivideException{
		
		
		if(y  == 0 )
			//使用 throw 来向上抛异常
			throw new DivideException("分母不能为0....");
		
		return x / y ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//除法
	public static double  divide(int x , int y ) {
		return x / y ;// 3/0
	}

}
