package com.ws.computer.chapter3;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import com.ws.computer.chapter1.Phone;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月24日上午10:58:33
 */
public class VariableTest {
	
	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.brand = "华为p30";
		p.price = 4999;
		methodA(p);
		System.out.println(p.brand);
		System.out.println(p.price);
		
	}

	/**
	 * @param p
	 */
	private static void methodA(Phone p) {
		p.brand  = "苹果11" ;
		p.price = 7999;
		
	}

	

}
