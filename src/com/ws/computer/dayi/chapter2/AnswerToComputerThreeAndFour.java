package com.ws.computer.dayi.chapter2;

import java.util.Arrays;

/**
 * @author 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 2020年4月13日下午2:51:42
 第一题： 请编写程序，实现对数组{25,24,12,76,101,96,28} 的排序。提示：使用冒泡排序算法。

第二题： 请编写程序，求数组{25,24,12,76,101,96,28}中最小值

第三题： 请编写程序， 逆序打印数组{25,24,12,76,101,96,28}中的每个元素。

第四题： 请编写程序，求数组{25,24,12,76,101,96,28}的平均值。

第五题： 定义一个Person类， 类的成员变量(属性)为年龄、身高、姓名，
                            类的成员方法(行为)为：1)运动  2)学习(studty)  3)吃饭(eat)
							
第六题：在外部new一个Person对象：1）使用该对象，将Person类中的成员变量赋值，并打印到控制台。  
                                 2）使用该对象调用Person类中的成员方法。
 */
public class AnswerToComputerThreeAndFour {
	
	public static void main(String[] args) {
		
		//冒泡排序：每一次冒泡，都有一个元素确定了最终的位置。
		
		int[] arr = {25,2,24,76,101,96,28};
		
		bubbleSort(arr);
	    int min = minOfArr(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(min);
		
		methodA(arr);
		float ft = methodNg(arr);
		System.out.println();
		
		System.out.println(ft);
		
		//引用类型变量
		Person p  = null;
		p = new Person();
		p.age = 26 ;
		p.name = "dlq";
		p.height = 180;
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.height);
		p.sport();
		p.eat();
		p.study();
	}

	/**
	 * @param arr
	 * @return
	 */
	private static float methodNg(int[] arr) {
		float sum = 0 ;
		for(int i = 0 ; i < arr.length ; i++){
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}

	/**
	 * @param arr
	 */
	private static void methodA(int[] arr) {
		for(int i = arr.length-1 ; i >= 0 ; i--){
			System.out.print(arr[i]+" ");
		}
	}

	/**
	 * @param arr
	 * @return
	 */
	private static int minOfArr(int[] arr) {
		int min = arr[0];//哨兵
		
		for(int i = 1 ; i < arr.length ; i++ ){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}

	/**
	 * @param arr
	 */
	private static void bubbleSort(int[] arr) {
		
		int temp = 0 ;
		//1.冒泡的次数
		for(int i = 1 ; i < arr.length ; i++){
			boolean flag = true;
			//2.比较的次数
			for(int j = 0 ; j < arr.length - i ; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = false;
				}
			}
			
			if(flag){
				break;
			}
			
		}
		
	}

}
