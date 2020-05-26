package com.ws.computer.chapter10.oneandtwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月26日下午3:05:40
 * 1.Date类
 */
public class DateTest {
	
	public static void main(String[] args) {
		//1.Date类从写了toString方法。。
		Date date = new Date();
		System.out.println(date.toString());//date 
		//2.格式日期：把日期转换成字符串
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = simple.format(date);
		System.out.println(dateStr);
		//3.把字符串转换日期
		try {
			Date date1 = simple.parse(dateStr);
			System.out.println(date1);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}

}
