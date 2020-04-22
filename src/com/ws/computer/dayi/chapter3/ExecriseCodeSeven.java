package com.ws.computer.dayi.chapter3;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月22日下午4:18:06
 * 
 * 1.编写一个方法，判断一个整数是否为回文数。
   回文数是指正序(从左向右)和倒序(从右向左)都是一样的整数。
   例如: 121为回文数。
     -121不是回文数，因为从左向右读为-121，从右向左读为121-。
     
     2.字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
  请定义一个方法实现字符串左旋转操作的功能。
  比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
  
     
 */
public class ExecriseCodeSeven {
	
	
	public static void main(String[] args) {
		//System.out.println(isP1(121));
		System.out.println(methodA("abcdefg", 3));
	}
	
	
	public static String methodA(String str , int number){
		
		//"abcdefg" 2   cdefg
		String headStr = str.substring(number, str.length());
		//abcdefg 2     ab
		String tailStr = str.substring(0,number);
		
		
		return headStr + tailStr;
		
		
		
	}
	
	
	
	
	
	
	public static boolean isP1(long number ){
		//1. number 变成字符串
		
		String str = String.valueOf(number);
		
		StringBuffer sbf = new StringBuffer();
		
		//2.得到反转后的字符串
		String reveStr = sbf.append(str).reverse().toString();
		
		//3.比较
		if(!str.equals(reveStr))
			return false;
		return true;
	}
	
	
	
	
	//1221
	public static boolean isP(long number){
		
		 
		//负数肯定不是回文数
		if(number < 0 )
			return false;
		
		//1.判断number的位数，找到该位数最小值。 四位数:1000 三位数：100
		int div = 1; 
		//1221
		while(number / div >= 10){
			div = div * 10 ;
		}
		
		while(number > 0 ){
			//2.分离出number的最高位，也就是左边的数
			//1221 /1000 =1
			long left = number / div ; 
			
			//3. 分离出number的最低位，也就是最右边的数
			//1221 %10 = 1
			long right = number % 10 ;
			
			//4.比较，如果不相等，就不是回文数。
			if(left !=  right)
				return false;
			
			//5. 1221 变成 22 由以前的4位数 变成 2位数 number=1221 变成 22
			//5.1：1221 变成 221 1221 % div  = 221 1221 %1000 = 221
			number = number % div ;
			//5.2:221 22 去掉最低位 221 / 10 = 22 
			number = number / 10 ;
			//6.div 去掉2位
			div = div  / 100 ;
		}
		
		return true;
	}
	
	
	
	
	

}
