package com.ws.computer.chapter12;

import java.util.Comparator;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月1日上午10:07:15
 */
public class Student implements Comparable<Student> {
	
	private String number;
	private int age;
	
	/**
	 * @param number
	 * @param age
	 */
	public Student(String number, int age) {
		super();
		this.number = number;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
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
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	

	@Override
	public String toString() {
		return "Student [number=" + number + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
	

}
