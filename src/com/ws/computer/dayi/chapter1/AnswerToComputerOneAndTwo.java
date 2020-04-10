package com.ws.computer.dayi.chapter1;

/**
 * 
 * @author dlq_tinysoft
 * 
 * 1.配置环境变量：把java.exe 和javac.exe 所在的路径C:\Program Files\Java\jdk1.8.0_202\bin
 *   配置到windows操作系统中的path下面。
 *   
 * 2.javac：把我们的.java文件编译成.class文件   java：把.class文件加载到jvm中，并运行
 * 
 * 
 * 3.jdk:java程序开发包   jre:java运行时环境   jvm:java虚拟机
 * 
 * 三者关系：  jdk > jre > jvm
 * 
 * 4.标识符： 1.必须由字母 数字 下划线组成  2.不能以数字开头
 * 
 * 5.变量和常量
 *   重点：变量
 *   
 * 6.if家族和switch
 *    if家族：三种
 *  
 * 7.循环语句：1.while 2.do-while 3.for
 * 
 * 8.数组：定义一个数组  数组的初始化  数组的遍历
 *
 */
public class AnswerToComputerOneAndTwo {
	
	
	
	public static void main(String[] args) {
		
		/*----------------------------变量的复习------------------*/
		
		//1.定义一个整型变量
		int myInt = 100 ; // int:数据类型   myInt:变量名  100：变量的值
		System.out.println(myInt);
		//变量三要素： 数据类型   变量名字  变量的值
		
		//double类型的变量
		double myDouble = 3.14;
		System.out.println(myDouble);
		
		//float类型变量
		float myFloat = 3.14f;
		System.out.println(myFloat);
		//数据类型：1.基本数据类型 ：boolean byte char short int long float double
		//        2.引用数据类型
		
		//字符串变量
		String myStr = "abc";
		System.out.println(myStr);
		
		/*---------------------常量复习--------------------*/
		//常量：只能被赋值一次值的变量
		//定义一个整型常量
		final int myIntConstant = 100 ;
		System.out.println(myIntConstant);
		//定义一个double类型常量
		final double myDoubleConstant = 100;
		System.out.println(myDoubleConstant);
		
		/*--------------------条件语句-----------------------*/
		//methodIf();
		
		/*------------------循环语句-----------------------*/
		//methodFor();
		
		/**-------------数组---------------*/
		methodArray();
		
		
		
		
	}

	//数组的复习
	private static void methodArray() {
		//定义一个大小为3的整型数组
		//int[] myIntArray 等价于 int myInt =100
		int[] myIntArray = new int[3];
		//数组的下标是从0开始的
		for(int i = 0 ; i < myIntArray.length ; i++){
			myIntArray[i]= i+1;
		}
		//定义一个double类型的数组，并初始化
		double[] myDoubleArray = new double[]{3.14,3.15,3.16};
		
		for(int j = 0 ; j < myDoubleArray.length ; j++){
			System.out.println(myDoubleArray[j]);
		}
		
		double[] myDoubleArray1 = {3.14,3.15,3.16};
		
		//定义一个引用类型的数组
		String[] myStrs = new String[3];
		
		String[] myStr1 = {"aa","bb"};
		
		for(String str :myStr1){
			System.out.println(str);
		}
		
		
	}

	//循环语句的复习
	private static void methodFor() {
		
		//while循环语句
		int i = 5 ;
		while(i > 0 ){
			System.out.println(i--);
		}
		
		//do-while
		do{
			System.out.println(i--);
		}while(i > 0 );//注意加个;
		
		//for循环： 增加for
		for(int j = 0 ; j  < 4 ; j++){
			System.out.println(j);
		}
		//增加for
		String[] myStr = {"abc","efg"};
		for(String str : myStr){
			System.out.println(str);
		}
		
		
	}

	//条件语句
	private static void methodIf() {
		
		//第一种
		int a = 3; 
		int b = 4;
		int c = 5 ;
		if(a > b ){
			;;;
		}
		
		//第二种
		if(a > c){
			;;;;
		}else{
			;;;;
		}
		//第三种
		if(a >c ){
			;;
		}else if( a >b ){
			;;;
		}else if( b > c ){
			;;;;
		}else if(a > c){
			;;;
		}else{
			;;;;;
		}
		
		//switch
		switch(a){
		case 1 : a = a+b ;
		break;
		case 2 : b = a+ c;
		default: c = 3;
		}
	}
}
