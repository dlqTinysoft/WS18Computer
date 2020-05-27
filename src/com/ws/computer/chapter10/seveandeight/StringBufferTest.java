package com.ws.computer.chapter10.seveandeight;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月27日下午4:31:27
 */
public class StringBufferTest {
	
	
	public static void main(String[] args) {
		
		
		//1.StringBuffer  vs  StringBuilder
		
		 
		String str = "ab:cd:ef:gh:ij";
		
		String[] strs = str.split(":");
		
		String newStr = "";
		for(String str1 : strs)
		    newStr+=str1;
		
		System.out.println(newStr);
		
		StringBuffer sbf = new StringBuffer();
		for(String newSTR: strs)
			sbf.append(newSTR);//字符串的拼接使用StringBuffer里面的append方法进行拼接。
		
		System.out.println(sbf.toString());
		StringBuilder sbd = new StringBuilder();
		for(String newSTR: strs)
			sbd.append(newSTR);//字符串的拼接使用StringBuffer里面的append方法进行拼接。
		System.out.println(sbd.toString());
		
		//StringBuffer是线程安全的，  StringBuilder是线程不安全的
	}

}
