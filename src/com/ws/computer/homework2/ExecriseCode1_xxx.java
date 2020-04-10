package com.ws.computer.homework2;

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
	
	/**
	 * 判断number是否为回文数
	 * 如果number为回文数，则返回true
	 * 如果number不是回文数，则返回false
	 * @param number
	 * @return
	 */
	public static boolean isPlalindrome(long number){
		boolean isFlag = true;
		
		
		
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
		
		
		return str;
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
		
		
		return number;
	}
}
