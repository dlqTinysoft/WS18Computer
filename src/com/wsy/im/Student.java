package com.wsy.im;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年10月15日上午10:35:42
 */
public class Student {
	
	private String name; //姓名
	private String age; //年龄
	private String schoolName; //学校
	
	//构造方法:1.方法名必须和类名相同   2.没有返回值
	public Student(){
		
		System.out.println("我是构造方法...");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	
	
	

}
