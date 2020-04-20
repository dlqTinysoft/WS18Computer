package com.ws.computer.homework2;

import java.util.Scanner;

/**
 * 作业题
 * 1.编写一个方法，判断一个整数是否为回文数。
            回文数是指正序(从左向右)和倒序(从右向左)都是一样的整数。
            例如: 121为回文数。
         -121不是回文数，因为从左向右读为-121，从右向左读为121-。

   2.字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
          请定义一个方法实现字符串左旋转操作的功能。
           比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
  
   3.编写一个方法：给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。

      例如：
         输入：n = 234
        输出：15 
        解释：
       各位数之积 = 2 * 3 * 4 = 24 
       各位数之和 = 2 + 3 + 4 = 9 
       结果 = 24 - 9 = 15
     例如：
       输入：n = 4421
       输出：21
       解释： 
       各位数之积 = 4 * 4 * 2 * 1 = 32 
       各位数之和 = 4 + 4 + 2 + 1 = 11 
        结果 = 32 - 11 = 21
 *
 */
public class ExecriseCode1_xxx {
	
	
	public static void main(String[] args) {
	
	}
	
	
	public static String reve1(String  str , int n){
		
		String strTail = str.substring(n,str.length());
		String strHead = str.substring(0,n);
		return strTail + strHead;
		
	}
	
	public static String reve(String str , int n){
		
		String strHead = "";
		
		String strTail = "";
		for(int i = n ; i < str.length() ; i++){
			strHead += str.charAt(i);
		}
		for(int i = 0 ; i < n ; i++){
			strTail += str.charAt(i);
		}
		return strHead + strTail;
	}
	
	
	
	//"121"   121
	public static boolean isP1(long number){
		
		//1.把number变成字符串
		String str = String.valueOf(number);
		//2.str反转过来
		StringBuffer sbf = new StringBuffer();
		sbf = sbf.append(str);
		sbf = sbf.reverse();
		String reverseStr = sbf.toString();
		
		//3.str 和 reverseStr进行比较
		if(!str.equals(reverseStr))
              return false;
		
		return true;
		
	}
	
	public static boolean isP(long number){
		
		if( number < 0 )
			return false;
		
		//分母
		int div = 1;
		
		//第一步:div的初始值
		while( number / div >= 10)
			div = div * 10;
		
		//第二步：判断回文数
		
		while(number > 0 ){
			//1221
			//1.number最高位，也是最左边的数字
			long left =  number / div;
			
			//2.number的最低位，也是右边的数字
			long right = number % 10 ;
			
			if(left != right)
				return false;
			
			//3.去掉最高的位数，也就是左边， 去掉最低位 也就是右边的数
			
			//去掉最高位
			number = number % div ;
			
			//去掉最低位
			number = number / 10 ;
			
			//4.div要变
			div = div / 100;	
		}
		return true;
	}
	
	
	/**
	 * 判断number是否为回文数
	 * 如果number为回文数，则返回true
	 * 如果number不是回文数，则返回false
	 * @param number
	 * @return
	 */
	public static boolean isPlalindrome(long number){
		boolean isFlag = true;
		String str = String.valueOf(number);
		StringBuffer sbf = new StringBuffer();
		String strReverse = sbf.append(str).reverse().toString();
		
		if(!str.equals(strReverse))
			isFlag = false;

		return isFlag;
	}
	
	public static boolean isPlalindrome1(long number){
		boolean isFlag = true;
		if(number < 0 )
			return false;
		int div = 1 ;
		while(number / div >= 10){
			div = div * 10 ;
		}
		while(number > 0 ){
			//获取number的最高位数
			long left = number / div;
			//获取number的最低位数
			long right = number % 10 ;
			//如果左右 不相等，则不是回文数
			if(left != right)
			  return false;
			
			//将最高位数字去除
			number = (number % div) ;
			//将最低位去除
			number = number / 10;
			
			//减少两位，分母/100
			div = div / 100;
		}
		return isFlag;
	}
	
	
	public static Boolean isPlalindrome2(long number){
		
		boolean isFlag = true;
		if( number < 0 || (number % 10 == 0 && number !=0))
			return false;
		
		
		long revertNumber = 0 ;
		
		while(number > revertNumber){
			// number%10 获取最低位数字
			revertNumber = revertNumber * 10 + number % 10 ;
			number = number / 10 ;
		}
		
		if(!(number == revertNumber || number == revertNumber / 10))
			isFlag =  false;
		return isFlag;
	}
	
	
	
	
	
	/**
	 * 字符串前面的n个字符转移到字符串的尾部。
	 * 例如输入："abcdefg"和数字2 即str="abcdefg" n=2
	 * 则函数的返回值为 ："cdefgab"
	 * 
	 * @param str = "abcdefg"
	 * @param n = 2
	 * @return "cdefgab"
	 */
	public static String strReversal(String str, int n ){
		String strTail = str.substring(n,str.length()) ;
		String strHead = str.substring(0,n);
		str = strTail + strHead;
		return str;
	} 
	
	
	public static String strReversal1(String str, int n){
		StringBuffer sbf = new StringBuffer();
		for(int i = n ; i < str.length() ; i++){
			sbf.append(str.charAt(i));
		}
		
		for(int i = 0 ; i < n ; i++){
			sbf.append(str.charAt(i));
		}
		
		return sbf.toString();
		
	}
	
	/**
	 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
	 *   函数入参：number = 234
     * 函数返回值为：15 
     *     解释：
     *  各位数之积 = 2 * 3 * 4 = 24 
     *  各位数之和 = 2 + 3 + 4 = 9 
     *  结果 = 24 - 9 = 15
	 * @param number = 234
	 * @return 15
	 */
	public static long result(long number){
		
		 long add = 0 ;
		 long mul = 1 ;
		 while(number > 0 ){
			 long digit = number %  10 ;
			 add += digit;
			 mul *= digit;
			 number = number / 10 ;
		 }
		return mul - add;
	}
}
