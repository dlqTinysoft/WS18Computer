package com.ws.computer.chapter8.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日下午3:25:54
 * 排序的工具类
 */
public class StudentUtils {
	
	
	//定义一个排序方法
	//工具类中的方法都定义为静态的
	public  static void  sort(Student[] stus, Comparator comp) {
		
		//冒泡排序
		
		for(int i = 1 ; i < stus.length; i++){
			
			for(int j = 0 ; j < stus.length - i ; j++){
				//stus[j] > stus[j+1]
				if(comp.compare(stus[j], stus[j+1])){
					Student temp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp;
				}
			}
			
		}
		
		
		
	}

}
