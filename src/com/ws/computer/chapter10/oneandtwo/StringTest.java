package com.ws.computer.chapter10.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月22日上午9:03:45
 * 1.String类
 */
public class StringTest {
	
	
	
	public static void main(String[] args) {
		
		//1.String类的构造方法
		String  str = new String("abc");
		System.out.println(str);
		
		char[] cs = new char[]{'a','b','c'};
		String scs = new String(cs);
		System.out.println(scs);
		System.out.println("==========================");
		//2.字符串的比较方法：equals:严格区分大小写 和equalsIgnoreCase：不用区分大小写
		System.out.println("abc".equals("aBc"));
		System.out.println("=================================");
		//对英文大小写不敏感
		System.out.println("abc".equalsIgnoreCase("AbC"));
		
		//3.startsWith和endsWith方法
		System.out.println("====================");
		
		System.out.println("abc".startsWith("bc"));
		
		System.out.println("===================");
		System.out.println("abc".endsWith("a"));
		
		//4.取字符串的长度 length()
		System.out.println("abcd".length());
		
		//5.字符串大小写转换：toLowerCase方法和toUpperCase
		System.out.println("=================");
		System.out.println("abc".toUpperCase());
		System.out.println("ABC".toLowerCase());
		
		//6.字符串的查找方法： indexOf  lastIndexOf
		System.out.println("abac".indexOf("a"));
		System.out.println("abacb".lastIndexOf("a"));
		
		//7.字符串的截取  substring方法
		System.out.println("==========substring===============");
		// [start,end)
		System.out.println("abcdefg".substring(2,4));//[2,4)
		System.out.println("===========================");
		//8.字符串的替换操作:replace
		System.out.println("abc".replace("ab", "B"));
		System.out.println("===================");
		//9.字符串的分割操作：split方法
		
		String str2 = "ab:cd:ef:gh:ij:km";
		
		String[]  strs = str2.split(":");
		for(String st : strs){
			System.out.print(st+" ");
		}
		//http协议：文本协议：字符串
	
		
		
		
		
		
	}

}
