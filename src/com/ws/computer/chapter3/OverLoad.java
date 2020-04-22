package com.ws.computer.chapter3;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月21日上午11:49:43
 * 
 * 方法的重载（overload）  loading...
 * 1.定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 * 	
 *  "两同一不同":同一个类、相同方法名
 *            参数列表不同：参数个数不同，参数类型不同
 * 2.判断是否是重载：
 *    跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系！
 * 3. 在通过对象调用方法时，如何确定某一个指定的方法：
 *      方法名 ---> 参数列表
 */
public class OverLoad {
	
	//如下的4个方法构成了重载
		public void getSum(int i,int j){
			System.out.println("1");
		}
		
		public void getSum(int i){
			
		}
		

		
		public void getSum(String name){
			
		}
		
		public void getSum(double d1,double d2){
			System.out.println("2");
		}
		
		public void getSum(String s ,int i){
			System.out.println("3");
		}
		
		public void getSum(int i,String s){
			System.out.println("4");
		}
		
		
		public void info(String name){
			System.out.println(name);
		}
	
	

}
