package com.ws.computer.homework3;

/**
 * 作者： 董乐强 邮箱：dlq_tinysoft@163.com 时间：2020年4月26日上午11:31:57
 * 1.请按照以下要求设计一个学生类Student，并进行测试。要求如下： （1）Student类中包含姓名、成绩两个属性。
 * （2）分别给这两个属性定义两个方法，一个方法用于设置值，另一个方法用于获取值。
 * （3）Student类中定义一个无参的构造方法和一个接收两个参数的构造方法，两个参数分别为姓名和成绩属性赋值。
 * （4）在测试类中创建两个Student对象，一个使用无参的构造方法，然后调用方法给姓名和成绩赋值， 一个使用有参的构造方法，在构造方法中给姓名和成绩赋值。
 * （5）通过toString方法将两个对象的成员变量内容进行输出。
 */
public class Student {

	// 成员变量 （属性）
	private String name;
	private float grade;
	
	
	

	// 定义两个构造方法，一个无参， 两个参数的

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}

	/**
	 * @param name
	 * @param grade
	 */
	public Student(String name, float grade) {
		this.name = name;
		this.grade = grade;
	}
	
	/**
	 * 
	 */
	public Student() {
		
	}



	// 设置get和set方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

}
