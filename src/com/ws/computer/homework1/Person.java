
package com.ws.computer.homework1;

/**
 * @author 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 2020年4月15日下午4:46:17
 * 第五题： 定义一个Person类， 类的成员变量(属性)为年龄、身高、姓名，
                            类的成员方法(行为)为：1)运动  2)学习(studty)  3)吃饭(eat)
							
      第六题：在外部new一个Person对象：1）使用该对象，将Person类中的成员变量赋值，并打印到控制台。  
                                 2）使用该对象调用Person类中的成员方法。
 */
public class Person {
	
	public int age;
	public float height;
	public String name;
	
	public void sport(){
		System.out.println("生命在于运动...");
	}
	
	public void studty(){
		System.out.println("好好学习，天天向上...");
	}
	
	public void eat(){
		System.out.println("想吃武汉热干面...");
	}
	
	

}
