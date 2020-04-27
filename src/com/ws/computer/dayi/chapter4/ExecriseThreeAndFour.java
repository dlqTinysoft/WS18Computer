package com.ws.computer.dayi.chapter4;

import java.util.Arrays;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月27日下午3:06:41
 * 
 * 3.输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
  注意：编写方法实现： public int[] getLeastNumbers(int[] arr , int k){}
   示列1：输入：arr = [3,2,1], k = 2
          输出：[1,2] 或者 [2,1]
		  
   示列2：输入：arr = [0,1,2,1], k = 1
          输出：[0]
          
    
    
    2.一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
   注意：编写方法实现需求，方法为： public static int  method( int n ){ return 0;}。 
    当n=2 ,则方法返回值为2：即两种跳法。 当 n= 7 时， 则方法返回值为21 即21种跳法。
    
    
    
    4.给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 true，否则返回 false。
  注意：编写方法实现：public  boolean isPerfectSquare(int num){}
  示列1：输入：16
        输出：true
  示列2：
		输入：14
        输出：false
          
          
          
 */
public class ExecriseThreeAndFour {
	
	public static void main(String[] args) {
		int[] arr = {3,2,1};
		
		int[] newArr = getLeastNumbers(arr, 1);
		//System.out.println(Arrays.toString(newArr));
		
		//System.out.println(methodA(7));
		
		System.out.println(isPerfectSquare(4));
		
	}
	
	//第四题： Math
	public static boolean isPerfectSquare(int num){
		
		if(num < 0 )
			throw new RuntimeException("输入参数非法：num不能小于0");
		
		double a = Math.sqrt(num);
		
		return (int)a - a == 0 ;
		
	
	}
	
	
	
	
	
	//第2题: 青蛙跳台阶
	// 1个台阶：1种跳法   2个台阶：2种跳法
	//设 n个台阶有f(n)种跳法。  n-1个台阶有f(n-1) 种跳法。   n-2个台阶：f(n-2)种跳法
	//f(n) = f(n-1) + f(n-2)
	//递归的写法
	public  static int method(int n){
		
		if( n < 1 )
			throw new RuntimeException("参数输入非法：n");
		if(n == 1 )
			return 1 ;
		if(n == 2 )
			return 2 ;
		
		return method(n - 1 ) + method(n - 2 );
	}
	
	//非递归的写法
	public  static int methodA( int n ){
		if( n < 1 )
			throw new RuntimeException("参数输入非法：n");
		if(n == 1 )
			return 1 ;
		if(n == 2 )
			return 2 ;
		
		int a = 1; // f(n-2)的值
	    int b = 2 ;//f(n-1)的值
	    int sum = 0 ; // f(n)值
	    
	    for(int i = 3 ; i <= n ; i++){
	    	//f(n) = f(n-1) + f(n-2)
	    	sum = a + b ;
	    	a = b ;
	    	b = sum ;
	    }
	    return sum ;
	}
	
	
	
	
	
	//第三题：Arrays
	public static int[] getLeastNumbers(int[] arr , int k ){
		
		//1.给arr数组排序
		Arrays.sort(arr);
		
		//2. 把数组中最小的k个数给取出来
		
		return Arrays.copyOfRange(arr,0,k);
	}

}
