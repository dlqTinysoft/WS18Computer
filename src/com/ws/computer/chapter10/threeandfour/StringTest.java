package com.ws.computer.chapter10.threeandfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日上午11:04:55
 * 常用类之字符串
 */
public class StringTest {
	
	
	public static void main(String[] args) {
		
		//1.String类的构造方法
		String str = new String("abc");
		System.out.println(str);
		char[] cs = new char[]{'a','b','c'};
		String str1 = new String(cs);
		System.out.println(str1);
		
		//2.比较字符串是否相等操作： equals 和equalsIgnoreCase
		System.out.println("=======================");
		System.out.println("abc".equals("abc"));
		System.out.println("aBc".equals("abc"));
		System.out.println("===================");
		//对大小写不敏感
		System.out.println("aBc".equalsIgnoreCase("abc"));
		System.out.println("===================");
		//3.startsWith  endsWith
		System.out.println("abc".startsWith("b"));
		System.out.println("===================");
		System.out.println("abc".endsWith("bc"));
		
		//4.获取字符串的长度：length
		System.out.println("abc".length());
		System.out.println("============================");
		//5.比较字符串的大小：compareTo方法
		System.out.println("aB".compareTo("aB"));// a-A = 97-65 = 32
		System.out.println((int)'A');//a=97 A = 65
		System.out.println("=========================");
		//6.字符串的大小写转换：toLowerCase()  toUpperCase
		System.out.println("abc".toUpperCase());
		System.out.println("ABC".toLowerCase());
		//7.查找字符串所在的位置：indexOf  lastIndexOf
		System.out.println("abc".indexOf("bc"));
		System.out.println("=========================");
		System.out.println("abacd".lastIndexOf("a"));
		//8.字符串的替换操作;replace
		System.out.println("====================");
		System.out.println("abc".replace("c", "Wbbb"));
		//9.字符串的截取操作：substring方法
		System.out.println("==========================");
		//[bengIndex,endIndex)
		System.out.println("abcdefg".substring(2,4)); //[2,4);
		System.out.println("==========================");
	   //10.字符串的分割操作:split方法
		String str4 = "ab:cd:ef:gh:ij:km";
		String[] strs = str4.split(":");
		for(String st : strs){
			System.out.print(st+" ");
		}
		
		
	}

}
