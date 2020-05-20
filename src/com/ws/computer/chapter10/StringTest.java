package com.ws.computer.chapter10;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日上午6:41:33
 * 1.String类相关操作
 */
public class StringTest {
	
	public static void main(String[] args) {
		
		//1.字符串的初始化
		String str = new String("abc");
		char[] c = new char[]{'a','b','c'};
		String str1 = new String(c);
		
		//2.字符串的比较操作：equals方法  equalsIgnoreCase()方法
		
		//3.startWith() 和 endsWith 是否以指定的字符串结束
		String str2 = "abc";
		System.out.println(str2.startsWith("ab"));
		System.out.println(str2.endsWith("c"));
		
		//4.比较字符串的大小
		System.out.println("a".compareTo("b"));
		
		//5.length()方法获取字符串的长度
		
		//6.字符串的大小写转换：toLowerCase() toUpperCase();
		System.out.println("ABC".toLowerCase());
		System.out.println("abc".toUpperCase());
		//7.查找字符串
		System.out.println("ababc".indexOf("b"));
		System.out.println("ababc".lastIndexOf("b"));
		//8.截取字符串
		System.out.println("ABCDEFG".substring(3));
		System.out.println("ABCDEFG".substring(2, 4));
		//9.字符串去空格 trime();
		
		//10字符串的替换
		System.out.println("abcabc".replace("b", "B"));
		
		//11分割字符串
		String str5 = "ab:cd:ef";
		
		String[] strs = str5.split(":");
		System.out.println(strs.length);
		for(String str11 : strs){
			System.out.println(str11);
		}
		
		//12.字符串的StringBuffer 和 StringBuilder
		//用于拼接字符串
		
		
		
		
		
		
	}

}
