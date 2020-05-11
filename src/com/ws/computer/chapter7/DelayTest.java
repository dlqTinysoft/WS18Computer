package com.ws.computer.chapter7;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月11日上午10:03:31
 */
public class DelayTest {
	
	private static void log(int level , Delay delay){
	    
		if(level == 1 ){
			System.out.println(delay.buildMessage());
		}
	
	}
	
	public static void main(String[] args) {
		log(1,()->{
			System.out.print("lambda执行....");
			return "hello world ";
			}
		);
	}

	
	
	
	
	




	

}
