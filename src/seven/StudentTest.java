package seven;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日下午5:01:03
 */
public class StudentTest {
	
	public static void main(String[] args) {
		Student stu = new Student();
		
		Student stu1 = new Student("张三",95);
		System.out.println(stu1.toString());
		System.out.println(stu1);//stu1.toString();
	}

}
