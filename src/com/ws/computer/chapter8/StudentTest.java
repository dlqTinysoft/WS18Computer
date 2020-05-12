package com.ws.computer.chapter8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日下午1:51:18
 * 
 * lamb表达式学习：
 */
public class StudentTest {
	
	
	public static void main(String[] args) {
		Student[] stus = {new Student("张三", 20,31105),
				new Student("李四",20,31102),
				new Student("王五",19,31107)};
		
		//接口回调:接口回调思想在代码设计里面经常用。
		StudentUtils.sort(stus, new com.ws.computer.chapter8.Comparator() {
			
			@Override
			public boolean compare(Student pre, Student curr) {
				if(pre.getAge() == curr.getAge())
					return pre.getNumber() > curr.getNumber();
				return pre.getAge()> curr.getAge();
			}
		});
		
		//lambda表达式写法
		StudentUtils.sort(stus, (Student pre, Student curr)->{
			if(pre.getAge() == curr.getAge())
				return pre.getNumber() > curr.getNumber();
			return pre.getAge() > curr.getAge();
		});
		
		
		for(Student stu : stus){
			System.out.println(stu);
		}
	}
}
