package com.ws.computer.chapter10.threeandfour;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月25日下午3:04:40
 */
public class DateTest {
	
	public static void main(String[] args) {
		//Date:日期类
		Date date = new Date();
		//Date类重写了toString()方法...
		System.out.println(date.toString());
		//将Date转换为String
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = simple.format(date);
		System.out.println(dateStr);
		
		try {
			//把字符串转换为日期
			Date date1 = simple.parse(dateStr);
			System.out.println(date1);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}

}
