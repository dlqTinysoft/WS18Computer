package com.ws.computer.chapter11;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月27日上午8:52:28
 */
public class PackTest {
	
	public static void main(String[] args) {
		
		
		byte bt = 124 ;
		
		//自动装箱
		Byte BT = new Byte(bt);
		
		//自动拆箱
		byte c = BT;
	}

}
