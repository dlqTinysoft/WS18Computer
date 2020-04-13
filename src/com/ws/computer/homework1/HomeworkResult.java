package com.ws.computer.homework1;

import java.util.Arrays;

/**
 * @author 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 2020年4月13日上午9:32:01
 * 第一题： 请编写程序，实现对数组{25,24,12,76,101,96,28} 的排序。提示：使用冒泡排序算法。
 * 第二题： 请编写程序，求数组{25,24,12,76,101,96,28}中最小值
 * 第三题： 请编写程序， 逆序打印数组{25,24,12,76,101,96,28}中的每个元素。
 * 第四题： 请编写程序，求数组{25,24,12,76,101,96,28}的平均值。
 */
public class HomeworkResult {
	
	public static void main(String[] args) {
		int[] arr = {25,24,12,76,101,96,28};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		//System.out.println(minOfArr(arr));
		//printSqArr(arr);
		System.out.println(average(arr));
		
		
	}
	
	//数组的平均值
	public static float average(int[] arr){
		float sum = 0 ;
		for(int i = 0 ; i < arr.length ; i++){
			sum = sum + arr[i];
		}
		
		return sum/arr.length ;
	}
	
	//逆序打印数组
	public static void  printSqArr(int[] arr){
		for(int i = arr.length -1 ; i >=0 ; i--){
			System.out.print(arr[i]+" ");
		}
	}
	
	//获取数组中的最小值
	public static int minOfArr(int[] arr){
		
		int min = arr[0];
		for(int i = 1 ; i < arr.length ; i++ ){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	
	
	
	
	//冒泡排序
	public static void bubbleSort(int[] arr){
		int temp ;
		//外层循环需要控制冒泡次数
		for(int i = 1 ; i < arr.length ; i++){
			boolean flag = true;
			//交换次数
			for(int j = 0 ; j < arr.length-i ; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp ;
					flag = false;
				}
			}
			if(flag){
				break;
			}
		}
	}
}
