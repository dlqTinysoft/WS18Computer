package com.ws.computer.chapter10;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月25日上午11:09:14
 */
public class StringBufferTest {
	
	
	
	public static void main(String[] args) {
		String str = "ab:cd:ef:gh";
		String[] strs = str.split(":");
		
		String newStr = "";
		for(String str1: strs)
			newStr+=str1;//不推荐这种写法，字符串的拼接，不要用+
		System.out.println(newStr+""+""+"");
		
		//StringBuffer StringBuilder
		//StringBuffer类是线程安全的  StringBuilder是线程不安全的
		
		StringBuffer sbf = new StringBuffer();
		//拼接字符串操作
		for(String str2 : strs)
			sbf.append(str2);
		
		String str3 = sbf.toString();
		System.out.println(str3);
		
		
		
		
	}

}
