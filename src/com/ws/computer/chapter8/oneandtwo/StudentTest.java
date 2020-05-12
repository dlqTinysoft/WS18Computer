package com.ws.computer.chapter8.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日下午3:18:55
 */
public class StudentTest {
	
	
	public static void main(String[] args) {
		
		//定义了一个 学生数组
		Student[] stus = {
				new Student(19,31105,"张三"),
				new Student(19,31102,"李四"),
				new Student(22,31109,"王五")
		} ;
			
		//把学生数组  按照学生的年龄从小到大进行排序。
		
	  //1.定义一个用来进行判断的接口。
		
	 //2. 定义一个工具类：用来排序
		//Arrays:数组的工具类。 对数组排序的方法，打印数组的信息的方法
		
		for(Student stu : stus){
			System.out.println(stu);
		}
		
		
		System.out.println("=====排序后=========");
  
    //3.对学生进行排序了
		StudentUtils.sort(stus, new Comparator() {
			
			@Override
			public boolean compare(Student stu1, Student stu2) {
				if(stu1.getAge() == stu2.getAge())
					return stu1.getNumber() > stu2.getNumber();
			  return stu1.getAge() > stu2.getAge();
			}
		});
		
	//4.lambda表达式写法
		StudentUtils.sort(stus, (Student stu1 ,Student stu2)->{
			if(stu1.getAge() == stu2.getAge())
				return stu1.getNumber() > stu2.getNumber();
		  return stu1.getAge() > stu2.getAge();
		});
		
		for(Student stu : stus){
			System.out.println(stu);//stu.toString();
		}	
	}

}
