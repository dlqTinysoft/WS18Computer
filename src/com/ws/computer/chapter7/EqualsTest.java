package com.ws.computer.chapter7;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月11日上午10:17:29
 * equals解析
 */
public class EqualsTest {
	public static void main(String[] args) {
		String str = "abc";
		String str1 = "abc";
		System.out.println(str == str1 );
		
		String str2 = new String("abc");
		String str3 = new String("abc");
		System.out.println(str2 == str3 );
		
		System.out.println(str.equals(str1));
		
		System.out.println(str2.equals(str1));
	}

}
