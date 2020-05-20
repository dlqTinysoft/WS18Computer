package com.ws.computer.chapter10;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日上午8:19:23
 * 包装类：Integer  Character Byte Double ......
 */
public class NumberTest {

	public static void main(String[] args) {
		Integer inte = new Integer(78);
		System.out.println(inte);
		Integer inter = inte.parseInt("45");
		System.out.println(inter);
	}
}
