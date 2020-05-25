package com.ws.computer.chapter10;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月25日上午11:20:00
 */
public class PackageTest {

	//Integer inte1 = new Integer(1);
	AtomicInteger atoInte = new AtomicInteger();
	public static void main(String[] args) {
		// 包装类(重点)
		//1.基本数据类型：八种：byte char boolean short int long float double
		
		int i = 100 ;
		char c = 'a';
		//byte ->Byte
		//char -> Character
		Character c1 = new Character('a');
		System.out.println(c1.toString());
		//boolean ->Boolean
		boolean b1 = false;
		Boolean b = new Boolean(false);
		System.out.println(b.toString());
		//int -> Integer
		
		int myInt = 1000;
		Integer inte = new Integer(1000);
		System.out.println(inte.toString());
		
		//short -> Short
		//long - > Long
		long myL = 100;
		Long myLg = new Long(100);
		
		//float -> Float
		float f = 0.25f;
		Float fl = new Float(0.25);
		//double - > Double
		double myD = 0.23 ;
		Double db1 = new Double(0.23);
		Double db2 = new Double(0.23);
		System.out.println(db1.equals(db2));
		
		//1.基本类型的八个包装类，都重写equals和toString方法
		
		
		//
		//AtomicInteger
		//AtomicLong
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
