package seven;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日下午4:59:51
 */
public class Student {
	
	private String name;
	private float grade;
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
	/**
	 * @param name
	 * @param grade
	 */
	public Student(String name, float grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	 

}
