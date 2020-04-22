package com.ws.computer.dayi.chapter3;

import java.util.Scanner;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月20日下午2:53:22
 * 
 */
public class ExecriseCode1_xxx {
	
	
	public static void main(String[] args) {
		//1221
		//-121 121-
		Scanner sc = new Scanner(System.in);
		
		
		//System.out.println(isP1(-1221));
		System.out.println(strReve("abcdefg",4));
		
		System.out.println(mulAndAdd(120));
	}
	
	
	public static long mulAndAdd(long number){
		
		long add = 0 ;
		
		long mul = 1 ;
		
		while(number > 0 ){
			long digit = number % 10 ;
			
			add  = add + digit;
			mul = mul * digit;
			
			number = number / 10 ;
		}
		
		
		return mul - add ;
		
	}
	
	
	public static String strReve(String str , int n){
		//abcdefg
		//n=2 cdefg
		String str1 = str.substring(n,str.length());
		
		//n=2 ab
		String str2 = str.substring(0,n);
		
		
		 
		return str1+str2;
	}
	
	
	//1221 -> "1221" -> "1221"
	public static boolean isP1(long number){
	 //String StringBuffer StringBuilder
		
	 //1.把number变为字符串
	 String str = String.valueOf(number);
	 
	 //2.把str给反转过来
	 StringBuffer sbf = new StringBuffer();
	 //链式写法
	 sbf = sbf.append(str);
	 sbf = sbf.reverse();
	 String reveStr = sbf.toString();
	 //String reveStr = sbf.append(str).reverse().toString();
	 
	 //3.str和反转后的比较。如果相等 回文数。不相等 就不是回文数
	  if(!str.equals(reveStr))
		  return false;
	
		return true;
	}
	
	
	//1221 
	//最高位：1  最低位：1
	//22 最高位：2 最低为：2
	public static boolean isP(long number){
		
		if(number < 0 )
			return false;
		
		//1.确定分母的初始值是多少，
		long div = 1 ;
		//1221
		while(number / div >= 10){
			div = div * 10 ;
		}
		
		//1221
		while(number > 0 ){
			//2.取出number的最高位，也就是最左边的数
			long left = number / div ;
			
			//3.取出number的最低位，也是最右边的数
			long right = number % 10 ;
			
			if(left != right)
				return false;
			
			//4.number-2 , number的值：把最高位去掉，最低位也去掉。
			//4-1:把最高位给去掉。
			number = number % div;
			//4-2：把最低位也去掉
			number = number / 10;
			
			//5.保持div的位数和number一致.
			div = div / 100 ;
		}
		
		return true;
	}
	
	
	
	
	
	
	

}
