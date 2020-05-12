package com.ws.computer.chapter8;

/**
 * 作者： 董乐强 邮箱：dlq_tinysoft@163.com 时间：2020年5月12日下午1:59:33
 */
public class StudentUtils {

	//排序工具类，一般工具类里面的方法都是静态方法。
	public static void sort(Student[] stu, Comparator cmp) {

		for (int i = 1; i < stu.length; i++) {

			for (int j = 0; j < stu.length - i; j++) {
				if (cmp.compare(stu[j], stu[j+1])) {
					Student temp = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = temp;
				}
			}

		}

	}

	

	
}
