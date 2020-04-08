package com.ws.computer.dayi.chapter1;

import java.util.*;

/**
 * 
 * @author dlq_tinysoft
 * 
 *         1. 配置环境变量：C:\Program Files\Java\jdk1.8.0_202\bin 添加到path下面。
 * 
 *         2. javac:编译 java是运行。 .java文件 使用javac编译成.class文件，
 *         java：把我们编译过的.class文件加载到jvm里面，并运行。
 * 
 *         3.jdk jre jvm 三者的关系 jdk：java开发包 jre:java运行的时候所依赖的环境
 *         jvm:java程序都跑在java虚拟机里面。 jdk > jre > jvm
 * 
 *         4. 常量和变量 重点：变量
 * 
 *         5.条件语句： if家族 和switch家族
 * 
 *         6.循环： while do-while for：增强for循环
 * 
 *         7.数组： 数组的定义 数组的初始化 数组的遍历 数组的使用
 */
public class AnswerToComputerThreeAndFour {

	public static void main(String[] args) {

		/** -------------------------变量复习------------------ */
		// 定义一个整型变量
		// 变量类型： int 变量的名字：myInt,标识符只能有数字 字母 和下划线组成，不能以数字开头
		// 变量的值：100
		int myInt = 100;
		// 变量类型： 基本数据类型和引用类型
		// 基本数据类型有八种：byte boolean char short int long float double
		System.out.println(myInt);
		byte myByte = 2;
		System.out.println(myByte);
		// 字符串类型,引用类型的变量
		String str = "abc";
		System.out.println(str);
		// 局部变量必须先初始化，才能使用。成员变量可以不初始化，系统会给一个默认值。
		double myDouble = 2.3;
		System.out.println(myDouble);

		float myFloat = (float) 3.2;
		float myFloat1 = 3.2f;
		double myDouble1 = 3.2;
		System.out.println(myFloat);
		System.out.println(myFloat1);
		System.out.println(myDouble1);

		/** ----------------常量复习------------------- */
		// 定义一个整型常量:只能被赋值一次的变量，叫做常量。 final 数据类型
		final int myIntConstant = 100;
		System.out.println(myIntConstant);
		// 字符串常量
		final String myStrConstant = "abc";
		System.out.println(myStrConstant);

		/** -----------------条件选择语句复习---------------------- */
		// methodIf();
		/** -----------------循环语句复习---------------------- */
		// methodFor();
		/** -----------------数组复习---------------------- */
		methodArray();
	}

	// 数组的复习
	private static void methodArray() {
		// 定义一个大小为3的整型数组
		// hash地址
		int[] myIntArray = new int[3];
		System.out.println(myIntArray);
		// 注意：数组的下标是从0开始的
		for (int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = i + 1;
		}

		for (int j = 0; j < myIntArray.length; j++) {
			System.out.print(myIntArray[j] + " ");
		}

		// 定义并初始化
		String[] myStrArray = { "abc", "ddd", "dddd" };
		for (String str : myStrArray) {
			System.out.println(str);
		}

		String[] myStrArray1 = new String[] { "ddd", "dd", "efg" };
		System.out.println(myStrArray1);

	}

	// 循环语句
	private static void methodFor() {

		int i = 5;

		while (i > 0) {
			System.out.println(i--);
		}

		do {
			System.out.println(i--);
		} while (i > 0);

		for (int j = 0; j < 5; j++) {
			System.out.println(j);
		}

		String[] strArray = { "abc", "efg", "www" };

		for (String str : strArray) {
			System.out.println(str);
		}
	}

	// if家族和switch
	private static void methodIf() {

		// if家族总共有三种

		// 第一种

		int a = 3;
		int b = 4;
		int c = 5;

		if (a > b) {
			c = a + b;
		}

		// 第二种
		if (c > a) {
			c = a - b;
		} else {
			c = a + b;

		}

		// 第三种
		if (a > b) {
			c = a + b;
		} else if (a > c) {
			c = a - b;
		} else if (c > b) {
			c = a * b;
		} else {
			c = a / b;
		}

		// switch
		// 数据类型，int String char
		switch (a) {
		case 1:
			c = a + b;
			break;
		case 2:
			c = a * b;
		case 3:
			c = a / b;
		case 4:
			c = a - b;
		default:
			c = 0;
		}
	}
}
