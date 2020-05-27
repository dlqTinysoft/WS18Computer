package com.ws.computer.chapter10.seveandeight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月27日下午4:18:35
 */
public class DateTest {
	
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());//date  date.toString()
		//1.Date类重写了toString()方法
		System.out.println("=======================");
		
		//2.日期转换成字符串
		SimpleDateFormat spdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String dateStr = spdf.format(date);
		System.out.println(dateStr);
		
		//3.字符串转换为日期
		try {
			Date newDate = spdf.parse(dateStr);
			System.out.println(newDate);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}

}
