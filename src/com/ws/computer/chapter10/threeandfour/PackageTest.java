package com.ws.computer.chapter10.threeandfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月25日下午3:32:02
 */
public class PackageTest {
	
	
	public static void main(String[] args) {
		//数据类型分为：引用类型和基本类型
		//基本类型有八种：byte char boolean short int long double float 
		//八种基本数据类型对应八个包装类，这八个包装类都重写了toString方法和equlas方法
		byte b = 125 ;
		Byte b1 = new Byte(b);
		byte ct = b1;
		System.out.println(b);
		System.out.println(b1.toString());
		
		char c = 'c';
		Character c1 = new Character('c');
		
		boolean bl = false;
		Boolean bll = new Boolean(false);
		
		short st = 125;
		Short stt = new Short((short) 125);
		
		int myInt = 100 ;
		Integer myInte = new Integer(100);
		Integer myInte1 = new Integer(100);
		System.out.println(myInte.equals(myInte1));
		
		long myLong = 123L;
		Long myLONG = new Long(123);
		
		double myDouble  = 3.25 ;
		Double myDOUBLE = new Double(3.25);
		
		float myFloat = 3.25f;
		Float myFLOAT = new Float(3.25);
		
		
		
		
		
	}

}
