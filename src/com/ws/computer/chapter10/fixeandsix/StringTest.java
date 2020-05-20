package com.ws.computer.chapter10.fixeandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日上午8:58:12
 * 1.String类
 */
public class StringTest {
	
	
	public static void main(String[] args) {
		//1.equals  和 equalsIgnoreCase
		String str1 = new String("abc");
		String str2 = new String("Abc");
		System.out.println(str1.equals(str2));
		//equalsIgnoreCase:不区分大小写
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//2.String类的构造方法
		String str3 = new String("abc");
		char[] cs = new char[]{'a','b','c'};
		//把字节数组转换为字符串
		String str4 = new String(cs);
		System.out.println(str4);
		
		System.out.println("============");
		//3.startsWith 和endsWith
		System.out.println("abc".startsWith("b"));
		System.out.println("abc".endsWith("bc"));
		
		//4.compareTo方法:比较两个字符串大小
		System.out.println("a".compareTo("d"));//a-b  a = 97   A = 65 
		//System.out.println((int)'A');
		
		//5.获取字符串的长度：length
		System.out.println(str4.length());
		//6.字符串的替换:replace
		System.out.println("abc".replace("bc", "B"));
		//7.字符串大小写转换：toLowerCase   toUpperCase
		System.out.println("aBc".toLowerCase());//abc
		System.out.println("abc".toUpperCase());//ABC
		
		//8.字符串的查找：index  lastIndexOf
		System.out.println("===================");
		System.out.println("abca".indexOf("a"));
		System.out.println("abca".lastIndexOf("a"));
		
		//9.字符串的截取：substring(beginIndex,endIndex): [ beginIndex , endIndex )
	    System.out.println("=====================");
	    System.out.println("abcdefg".substring(2, 4));//[2,4)
	    //10.字符的分割：split
	    String str6 = "ab:cd:ef:gh";
	    String[] strs = str6.split(":");//形参传入的是分割的规则
	    System.out.println("=====================");
	    for(String st : strs){
	    	System.out.print(st+" ");
	    }
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
