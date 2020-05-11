package com.ws.computer.chapter7.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月11日上午10:59:16
 */
public class Student   {
	
	private int age ;
	private String name ;
	/**
	 * @param age
	 * @param name
	 */
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	//比较两个对象的成员变量值是否一样，如果一样返回ture,否则返回false
	
	

}
