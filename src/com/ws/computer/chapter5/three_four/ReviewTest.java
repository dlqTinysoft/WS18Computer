package com.ws.computer.chapter5.three_four;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日上午10:56:31
 */
public class ReviewTest {
	
	
	
	
	
	//方法的重载： 满足两个相同，一个不同
	//相同：1.必须在一类中， 2.方法名必须相同
	//不同：方法的形参列表不同：1.参数个数不同， 2.参数类型不同
	//方法递归：1.递推关系式  2.递归要有结束条件。
	
	
	//构造方法：方法名必须和类名相同， 构造不能有返回值，void类型也不行
	
	//this关键字
	
	//static关键字
	
	public static void main(String[] args) {
		Review re = new Review();
		System.out.println(re);
		re.setInfo("info");
		
		System.out.println(Review.name);
		Review.method();
		//1.静态方法里面不能调用非静态方法
		//2.非静态方法里面可以调用静态方法
		
	}
	
	
	public ReviewTest(String name , int i ){
		
	}
	
	public ReviewTest(){
		
	}
	
	
	
	public void method(){
		
		//method();
		
	}
	
	public void method(int i ){
		
	}
	
	

}
