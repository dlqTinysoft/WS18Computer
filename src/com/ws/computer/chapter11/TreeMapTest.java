package com.ws.computer.chapter11;

import java.util.TreeMap;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月24日上午9:47:02
 */
public class TreeMapTest {
	
	public static void main(String[] args) {
		//1.new出TreeMap对象
		TreeMap<String, Integer> tMaps = new TreeMap<String,Integer>();
		//2.向TreeMap中put键值对key-value
		tMaps.put("张三", 21);
		tMaps.put("李四", 22);
		tMaps.put("王五", 23);
		//3.通过key获取value
		tMaps.get("王五");
	}

}
