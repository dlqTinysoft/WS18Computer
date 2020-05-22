package com.ws.computer.chapter10.seveandeight;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月22日上午11:11:24
 * 常用类之String
 */
public class StringTest {
	
	public static void main(String[] args) {
		
		//1.String类的构造方法。
		String  str = new String("abc");
		System.out.println(str);
		char[] cs = new char[]{'a','b','c'};
		String str1 = new String(cs);
		System.out.println(str1);
		
		//2.字符串的比较操作 equals:严格区分大小写的和 equalsIgnoreCase:不区分大小写的，也就是对大小写不敏感
		
		System.out.println("=========================");
		System.out.println("abc".equals("aBc"));
		
		System.out.println("===========================");
		System.out.println("abc".equalsIgnoreCase("ABc"));
		
		//3.startsWith和endsWith方法。
		System.out.println("===============================");
		System.out.println("abc".startsWith("b"));
		System.out.println("===============");
		System.out.println("abc".endsWith("ab"));
		
		//4.获取字符串的长度 ： length();
		System.out.println("abcd".length());
		
		//5.字符串的大小写进行转换：toLowerCase  toUpperCase
		System.out.println("========================");
		System.out.println("ABC".toLowerCase());//ABC -> abc
		System.out.println("abc".toUpperCase());//abc -> ABC
		
		//6查找字符串的位置： indexOf 和lastIndexOf
		
		System.out.println("===================");
		System.out.println("abcab".indexOf("a"));
		
		System.out.println("===============");
		System.out.println("abcabd".lastIndexOf("a"));
		System.out.println("=======================");
		//7.字符串的截取操作substring方法
		System.out.println("abcdefg".substring(2,4));//[2,4)
		
		//8.字符串的替换： replace
		System.out.println("abcd".replace("ab", "BCD"));
		
		//9.字符串的分割 split
		String str3 = "ab:cd:ef:gh:ij:km";
		String[] strs = str3.split(":");
		System.out.println("======================");
		for(int i = 0 ; i< strs.length ; i++){
			System.out.print(strs[i]+" ");
		}
		
		//http协议：字符串协议 
		"abc".
		
		
	}

}
