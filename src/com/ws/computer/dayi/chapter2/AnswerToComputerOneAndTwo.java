package com.ws.computer.dayi.chapter2;

import java.util.Arrays;

/**
 * 
 * 作者： 董乐强 
 * 邮箱：dlq_tinysoft@163.com 
 * 时间：2020年4月17日上午8:50:26 
 * 
 * 第一题：请编写程序，实现对数组{25,24,12,76,101,96,28} 的排序。提示：使用冒泡排序算法。
 * 
 * 第二题： 请编写程序，求数组{25,24,12,76,101,96,28}中最小值
 * 
 * 第三题： 请编写程序， 逆序打印数组{25,24,12,76,101,96,28}中的每个元素。
 * 
 * 第四题： 请编写程序，求数组{25,24,12,76,101,96,28}的平均值。
 * 
 * 第五题： 定义一个Person类， 类的成员变量(属性)为年龄、身高、姓名， 类的成员方法(行为)为：1)运动 2)学习(studty)
 * 3)吃饭(eat)
 * 
 * 第六题：在外部new一个Person对象：1）使用该对象，将Person类中的成员变量赋值，并打印到控制台。
 * 2）使用该对象调用Person类中的成员方法。
 */
public class AnswerToComputerOneAndTwo {

	public static void main(String[] args) {
		
		int[] arr = {25,24,12,76,101,96,28};
		
		//1.每冒泡一次，都有一个元素确定了最终的位置。
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(minArr(arr));
		System.out.println();
		methodNg(arr);
		System.out.println();
		float minF = methodA(arr);
		System.out.println(minF);

	}
    /**
	 * @param arr
	 * @return
	 */
	private static float methodA(int[] arr) {
		
		float sum = 0 ;
		for(int i = 0 ; i < arr.length ; i++){
			sum = sum + arr[i];
		}
		
		
		return sum / arr.length;
	}
	/**
	 * @param arr
	 */
	private static void methodNg(int[] arr) {
		
		for(int i = arr.length-1 ;  i >=0 ; i--){
			System.out.print(arr[i]+" ");
			
		}
	}
	/**
	 * @param arr
	 * @return
	 */
	private static int minArr(int[] arr) {
		int min = arr[0];
		for(int i = 1 ; i < arr.length ; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	//冒泡排序
	private static void bubbleSort(int[] arr) {
		
		int temp = 0 ;
		boolean flag = true;
		//1，控制冒泡的次数
		for(int i = 1 ; i <= arr.length-1 ;  i++){
			flag = true;
			//2.每一次冒泡，元素之间需要进行比较，比较多少次。 arr.length - i;
			for(int j = 0 ;  j < arr.length - i ; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = false;
				}	
			}
			//没有发生一次交换，那么元素已经有序了，推出外层循环，不需要冒泡了
			if(flag){
				break;
			}
		}
	}

}
