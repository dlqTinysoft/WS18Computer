package com.ws.computer.dayi.chapter1;
import java.util.Arrays;
import java.util.Iterator;
/**
 * 
 * @author dlq_tinysoft
 * 
 *         1. 环境变量的配置：java.exe 和javac.exe 所在的路径：C:\Program
 *         Files\Java\jdk1.8.0_202\bin 配置到环境变量path里面。
 * 
 *         2.javac 编译 .java文件 编译成我们的 .class文件 . java命令把我们的.class 加载到jvm里面并运行。
 * 
 *         3. jdk > jre > jvm
 * 
 *         4. 常量 和 变量 重点：变量
 * 
 *         5.条件选择语句 if 和switch
 * 
 *         6.循环： while do-while for:增强for循环
 *         
 *         7.数组： 数组的定义 数组的使用 数组的遍历
 */
public class AnswerToComputerFiveAndSix {

	public static void main(String[] args) {
		// 常量：1.final 2.只能被赋值一次
		final int age = 100;
		System.out.println(age);
		// 变量： 1. 基本类型的变量 和引用类型的变量
		// 基本类型变量： byte char boolean short int long float double
		// 定义一个整型变量: 变量类型 变量名字 变量的值
		// 标识符： 字母 数字 下划线组成， 但是不能以数字开头
		int myInt = 100;
		System.out.println(myInt);
		// 定义了double类型变量
		// 局部变量要使用 必须先初始化，否则无法使用，编译通过不了
		double myDouble = 3.3;
		System.out.println(myDouble);
		// 引用类型变量
		String str = "ddddd";
		System.out.println(str);
		//MethodInfo();
		//methodFor();
		methodArray();
	}

	//数组的定义 数组的使用 数组的遍历 
	public static void methodArray() {
		
		//定义一个整型数组
		//hash地址
		int[] myIntArray = new int[3];
		System.out.println(myIntArray);
		
		for(int i = 0 ; i<myIntArray.length ; i++){
			myIntArray[i] = i+1;
		}
		
		for(int j = 0 ; j < myIntArray.length ; j++){
			System.out.println(myIntArray[j]);
		}

		//增强for循环来遍历数组
		String[] myStr = { "abc", "cdf", "efg" };

		for (int i1 = 0; i1 < myStr.length; i1++) {
			System.out.println(myStr[i1]);
		}

		for (String str : myStr) {
			System.out.println(str);
		}
		
		String [] myStr1 = {"abc","efg"};
		Arrays.toString(myStr1);
		
		
		//javac 编译 是通过的
		System.out.println(myStr1[2]);
		
		
		
	}

	

	// 循环
	private static void methodFor() {
		int i = 5;

		while (i > 0) {
			i--;
			System.out.println(i);
		}

		do {
			i--;
			System.out.println(i);
		} while (i > 0);

		for (int j = 0; j <= 5; j++) {
			System.out.println(j);
		}

		// 增强for循环

		String[] myStr = { "abc", "cdf", "efg" };

		for (int i1 = 0; i1 < myStr.length; i1++) {
			System.out.println(myStr[i1]);
		}

		for (String str : myStr) {
			System.out.println(str);
		}

	}

	// if 和 switch
	private static void MethodInfo() {

		int a = 10;

		int b = 4;

		int c = 0;

		// 第一种
		if (true) {
			c = a + b;
		}

		// 第二种
		if (a > b) {
			c = a - b;
		} else {
			c = a + b;
		}

		// 第三种
		if (a > b) {

		} else if (c > b) {

		} else if (a > c) {

		} else {

		}

		// =============switch============
		// int String char
		switch (1) {
		case 1:
			c = a + b;
			break;
		case 2:
			c = a - b;
		default:
			c = 5;
		}

	}

}
