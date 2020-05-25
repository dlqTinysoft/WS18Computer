package com.ws.computer.chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日上午7:01:45
 * 
 * 日期类
 */
public class DateTest {
	public static void main(String[] args) {
		//new一个日期类
		Date date = new Date();
		System.out.println(date.toString());
		//日期类转换为字符串
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = format.format(date);
		System.out.println(strDate);
		try {
			//日期转换为字符串
			Date date1 = format.parse(strDate);
			System.out.println(date1);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	
		
		
	
	}
	

}
