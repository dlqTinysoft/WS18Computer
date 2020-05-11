package com.ws.computer.chapter7.threeandfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月11日下午3:05:05
 */
public class Student {
	
	private int number; // 学号
	private String name; //姓名
	/**
	 * @param number
	 * @param name
	 */
	public Student(int number, String name) {
		super();
		this.number = number;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
	
	
	
	

}
