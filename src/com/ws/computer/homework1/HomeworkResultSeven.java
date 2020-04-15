
package com.ws.computer.homework1;

import java.util.Arrays;

/**
 * @author 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 2020年4月15日下午4:18:44
 * 第一题： 请编写程序，实现对数组{25,24,12,76,101,96,28} 的排序。提示：使用冒泡排序算法。
 * 第二题： 请编写程序，求数组{25,24,12,76,101,96,28}中最小值
 * 第三题： 请编写程序， 逆序打印数组{25,24,12,76,101,96,28}中的每个元素。
 * 第四题： 请编写程序，求数组{25,24,12,76,101,96,28}的平均值。
 */
public class HomeworkResultSeven {
	
	public static void main(String[] args) {
		//1.冒泡排序，每冒泡一次，就有一个元素确定了最终的位置。
		
		int[] arr = {25,24,12,76,101,96,28};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("===============");
		System.out.println(minArr(arr));
		System.out.println("==============");
		methodArr(arr);
		System.out.println();
		System.out.println("=============");
		float pArr = methodArr1(arr);
		System.out.println(pArr);
		Person p = new Person();
		p.age = 26;
		p.height= 180;
		p.name = "dlq";
		p.sport();
		p.eat();
		p.studty();
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.height);
	}

	/**
	 * @param arr
	 * @return
	 */
	private static float methodArr1(int[] arr) {
		
		 float sum = 0 ;
		 for(int i = 0 ; i< arr.length ; i++){
			 sum += arr[i];
		 }
		
		return sum/arr.length;
	}

	/**
	 * @param arr
	 */
	private static void methodArr(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = arr.length -1 ; i>=0 ; i--){
			System.out.print(arr[i]+" ");
		}
		
	}

	/**
	 * @param arr
	 */
	private static int minArr(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0]; //哨兵
		
		for(int i = 1 ; i < arr.length ; i++){
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
		boolean flag = true;
		//1.冒泡的次数
		for(int i = 1 ; i <=arr.length -1  ; i++){
			//交换的次数
			for(int j = 0 ; j <arr.length - i ; j++){
				if(arr[j]> arr[j+1]){
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
