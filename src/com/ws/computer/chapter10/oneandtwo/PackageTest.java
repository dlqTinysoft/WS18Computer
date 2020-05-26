package com.ws.computer.chapter10.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月26日下午3:32:27
 */
public class PackageTest {
	
	public static void main(String[] args) {
		
		//1.八种基本数据类型；byte char boolean short int long float double
		byte bt = 125;
		System.out.println(bt);
		Byte myBt = new Byte((byte) 125);
		System.out.println(myBt.toString());
		//2.八种基本数据类型，对应八个包装类。这个八个包装类都重写了toString方法和equlas方法
		//自动装箱
		char c = 'c';
		Character myCC = new Character(c);
		//自动拆箱
		char ccc = myCC;
		Character myC = new Character('c');
		
		boolean myB = false;
		Boolean MYB = new Boolean(false);
		
		short myShort = 124;
		Short MYShort = new Short((short) 124);
		
		int myInt = 125 ;
		Integer MYInt = new Integer(125);
		Integer MYInt1 = new Integer(125);
		System.out.println(MYInt.equals(MYInt1));
		long myLong = 125;
		Long MYLong = new Long(125);
		
		float myFloat = 0.35f;
		Float MYFloat = new Float(0.35);
		
		double myDouble = 0.36;
		Double MYDouble = new Double(0.36);
		
		
		
		
		
		
		
		
	}

}
