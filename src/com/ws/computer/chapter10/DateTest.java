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
		Date date = new Date();
		System.out.println(date);
		//日期类转换为字符串
		DateFormat bf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = bf.format(date);
		System.out.println(strDate);
		//字符串转日期
		try {
			Date date1 = bf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	
	}
	

}
