package com.ws.computer.chapter10.threeandfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月25日下午3:16:45
 */
public class StringBufferTest {
	StringBuffer sbf = new StringBuffer();
	public static void main(String[] args) {
		//1.StringBuffer
		
		String str = "ab:cd:ef:gh";
		String[] strs = str.split(":");
		
		String newStr = "";
		for(String str1 : strs)
			newStr+=str1;
		System.out.println(newStr);
		//System.out.println("ddd"+"ddd"+"eff");
		
		//采用StringBuffer进行字符串拼接
		StringBuffer sbf = new StringBuffer();
		for(String str2: strs)
			sbf.append(str2);
		String newSp = sbf.toString();
		System.out.println(newSp);
		//StringBuilder vs StringBuffer
		//StringBuilder :线程不安全的
		//StringBuffer：线程安全的
	}

}
