package com.ws.computer.chapter8.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日下午3:24:19
 */
public interface Comparator {
	//定义一个抽象方法，比较stu1和stu2
	//stu1 > stu2   true
	public abstract boolean compare(Student stu1, Student stu2 );

}
