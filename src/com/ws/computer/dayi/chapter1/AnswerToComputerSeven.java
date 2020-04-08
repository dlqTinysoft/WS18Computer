package com.ws.computer.dayi.chapter1;

import java.util.Arrays;

/**
 * 
 * @author dlq_tinysoft
 * 
 *  1.javac->把我们的.java文件编译成.class文件    java->把我们的.class文件加载到jvm并运行。
 *  
 *  2.配置jdk的环境变量：把javac.exe 和java.exe 所在的目录：C:\Program Files\Java\jdk1.8.0_202\bin
 *    windows系统种path里面。
 *    
 *  3.jdk:java程序开发包     jre:java运行时的环境     jvm：java虚拟机
 *    jdk > jre > jvm
 *    
 *  4.标识符：字母 数字 下划线组成，而且不能以数字开头
 *  
 *  5.常量和变量
 *    重点是变量：八种基本数据类型
 *  
 *  6.if家族和switch
 *  
 *  7.循环语句： 1.while  2. do-while  3.for：增强for循环
 *  
 *  8.数组：定义一个数组， 数组初始化  遍历数组
 *
 */
public class AnswerToComputerSeven {
	
	public static void main(String[] args) {
		
		/*------------------变量复习----------------------*/
		//定义一个整型变量
		//变量三要素： 数据类型：int   变量的名字:myInt  变量的值:100
		//数据类型分为两种： 基本数据类型  和引用数据类型
		//基本数据类型（8种）:byte char boolean short int long double float
		int myInt = 100;
		System.out.println(myInt);
		//定义一个引用类型变量
		String myStr = "abc";
		System.out.println(myStr);
		
		/*-----------------常量复习---------------*/
		//常量是：只能被赋值一次的变量
		//定义一个整型常量
		final int myIntConstant = 1000; 
		System.out.println(myIntConstant);
		final float myFloatConstant = 3.14f ;
		System.out.println(myFloatConstant);
		
		/***************选择语句复习--------------*/
		//methodChoose();
		/***************循环语句复习--------------*/
		//methodFor();
		/***************数组复习--------------*/
		methodArray();
		
	}

	private static void methodArray() {
		// TODO Auto-generated method stub
		//数组的复习
		
		//定义一个大小为3的整型数组
		//见到new这个关键字，向我们jvm要申请内存， 3*int大小的内存
		int[] myIntArray = new int[3];
		System.out.println(myIntArray);
		//定义一个数组 并初始化
		int[] myIntArray1 = new int[]{1,2,3,4,};
		
	    //定义一个字符串数组并初始化
		String[] myStrs = new String[]{"abc","ddf"};
		
		String[] myStrs1 = {"abc","dddd"};
		
		//数组遍历：通过下标来遍历数组里面的值 . 下标是从0开始的
		for(int i = 0 ; i < myIntArray1.length ; i++){
			System.out.print(myIntArray1[i]+" ");
		}
		
		System.out.println(Arrays.toString(myIntArray1));
		
		for(String str : myStrs1){
			System.out.println(str);
		}
		
		
		
	}

	private static void methodFor() {
		// TODO Auto-generated method stub
		//循环语句
		//while
		int i= 5 ;
		while(i > 0 ){
			System.out.println(i--);
		}
		//do-while
		do{
			System.out.println(i--);
		}while(i > 0 );
		
		//for循环
		for(int j = 0 ; j < 10 ; j++){
			System.out.println(j);
		}
		
		//增加for循环
		String[] myStrs = new String[]{"abc","efg","wjk"};
		
		for(String str : myStrs){
			System.out.println(str);
		}
		
		
		
	}

	private static void methodChoose() {
		// TODO Auto-generated method stub
		//if家族和switch
		
		//if 三种结构
		
		//第一种
		if(true){
			;;;
		}
		
		int a = 2 ; 
		int b = 3 ;
		int c  = 4 ;
		
		//第二种
		if(a>b){
			;;;
		}else{
			;;;;
		}
		//第三种
		if(a>b){
			;;;;
		}else if(a > c){
			;;;;
		}else if(b > c){
			;;;
		}else{
			;;;;
		}
		
		//switch
		//char int String
		//不能
		switch(a){
		case 1 : a = c + b ;
		break;
		case 2 : ;;;
		case 3 : ;;
		
		default : a = c - b;
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
