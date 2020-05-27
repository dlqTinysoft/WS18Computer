package com.ws.computer.chapter10.seveandeight;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月27日下午4:40:08
 */
public class PackageTest {
	
	public static void main(String[] args) {
		
		//1.包装类是对八种基本数据类型的包装
		
		//2.八种基本数据类型：byte char boolean short int long float double 
		
		byte bt = 125;
		
		Byte mBt = new Byte((byte) 125);
		Byte mBt1 = new Byte((byte)125);
		//3.八种包装类都重写了toString方法和equlas方法
		System.out.println(mBt.equals(mBt1));
		System.out.println(mBt);//mBt.toString();
		
		
		
		char cr = 'c';
		Character cR = new Character('c');
		
		short st = 124;
		Short sT = new Short((short) 124);
		//4.自动拆箱  自动装箱
		int myInt = 129;
		Integer integer = new Integer(myInt);	
		int myInt1 = integer;
		
		
		Integer myInter = new Integer(129);
		
		long myLong = 1236;
		Long myLONG = new Long(1236);
		
		float ft = 3.15f ;
		Float fT = new Float(3.15);
		
		double dl = 3.15;
		Double dlD = new Double(3.15);
		
		
		
	}

}
