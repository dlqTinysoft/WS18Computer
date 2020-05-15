package com.ws.computer.dayi.chapter5.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月15日上午8:58:50
 */
public class Student {
	
	private String name ;
	private int number;
	/**
	 * @param name
	 * @param number
	 */
	public Student(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.number != other.number)
			return false;
		return true;
	}
	
	
//	public boolean equals(Object object){
//		//强制类型转换：父类类型转换子类类型
//		Student stu = (Student)object;
//		
//		//this 和 object
//		//this.name -> stu1.name 
//		//stu.name == object.name -> stu2.name
//		if(this.name.equals(stu.name) && this.number == stu.number)
//			return true;
//		return false;
//	}
	

}
