package com.ws.computer.chapter10.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月26日下午3:20:05
 */
public class StringBufferTest {
	public static void main(String[] args) {
		
		String str = "ab:cd:ef:gh";
		
		String[] strs = str.split(":");
		
		String newStr = "";
		for(String str1 :strs)
			newStr+=str1;//用+号进行字符串拼接
		System.out.println(newStr);
		//StringBuffer类，来进行字符串的拼接
		StringBuffer sbf = new StringBuffer();
		for(String str2: strs)
			sbf.append(str2);//使用append方法进行字符串拼接
		String newStr1 = sbf.toString();
		System.out.println(newStr1);
		//StringBuilder vs  StringBuffer  String
		//线程安全性
		//StringBuilder：线程不安全的
		//StringBuffer:是线程安全的
	}

}
