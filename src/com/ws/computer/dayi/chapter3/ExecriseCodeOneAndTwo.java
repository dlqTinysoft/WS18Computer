package com.ws.computer.dayi.chapter3;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月24日上午8:46:22
 * 
 * 1.编写一个方法，判断一个整数是否为回文数。
   回文数是指正序(从左向右)和倒序(从右向左)都是一样的整数。
   例如: 121为回文数。
     -121不是回文数，因为从左向右读为-121，从右向左读为121-。
     
     2.字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
  请定义一个方法实现字符串左旋转操作的功能。
  比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     
     
 */
public class ExecriseCodeOneAndTwo {
	
	
	public static void main(String[] args) {
		//System.out.println(isP1(123));
		System.out.println(getReveStr("abcdefg", 3));
	}
	
	
	public static String getReveStr(String str , int number){
		
		return str.substring(number, str.length())+ str.substring(0, number);
	}
	
	// 1221 -> "1221"  : 反转：  "1221"
	public static boolean isP1(long number){
		
		//1.把number变成 字符串
		String str = String.valueOf(number);
		
		//2.把str给反转过来
		StringBuffer sbf = new StringBuffer();
		String reveStr = sbf.append(str).reverse().toString();
		 
		 //3.比较 str 和 reveStr
		 if(!str.equals(reveStr))
			 return false;
		return true;
	}
	
	
	//判断 number是不是回文数
	// 1221  -1221   1221 : 一个回文数，有n位，结论： n ==  1, n-1== 2 
	// n-2 == 3  n-3 == 4
	//如果我们能提取 number的最高位和最低位， 
	//number位n位:  第一次循环： 第n位这个数字 和最低位这个数字进行比较
	//number由n位变成 n-2位
	//1.提取number的最低位，也就是个位 ： number % 10 ; 1221 % 10 = 1
	// number = 123   123 % 10 = 3
	//2 ,拿到一个数的最高位：   number= 1221   1221/1000 = 1
	// number = 123   123 / 100 = 1
	public static boolean isP(long number){
		
		if(number < 0 )
			return false;
		
		//1.确定分母： div
		long div = 1 ;
		
		//2.确定div的初始值
		while( number / div >= 10 ){
			div = div * 10 ;
		}
		
		//1221
		while( number > 0 ){
			
			//3.获取number最高位：左边的数字
			long left = number / div ;
			//4.获取number的最低位:右边的数字
			long right = number % 10 ;
			//5.判断number的最低位和最高位是否相等
			if(left != right)
				return false;
			
			//number = 1221 number要降低两位 number = 22 
			//6.把 number：n位 ， n-2位。  1221 -> 22
			//6-1:1221  221    1221 % 1000 = 221
			number = number % div ;
			//6-2:number = 221  221 -> 22 
			//221 /10  22
			number = number /  10 ;
			
			//7.number降低两位
			div = div / 100 ;
		}
		return true;
	}

}
