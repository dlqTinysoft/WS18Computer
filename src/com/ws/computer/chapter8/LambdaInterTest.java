package com.ws.computer.chapter8;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午9:29:16
 */
public class LambdaInterTest {
	
	public static void main(String[] args) {
		test(1,new LadmdaInterface() {
			
			@Override
			public boolean isFlag(int myInt) {
				System.out.println("方法被执行");
				if(myInt == 1 )
					return true;
				return false;
			}
		});
		
		//lambda表达式写法:函数式编程
		test(1,(int myInt)->{
			System.out.println("lambda表达式被执行");
			if(myInt == 1 )
				return true;
			return false;
		});
		
	}
	
	private static void test(int myInt , LadmdaInterface la){
		boolean flag = la.isFlag(myInt);
		System.out.println(flag);
	}

}
