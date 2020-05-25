package com.ws.computer.chapter11;

import java.util.HashMap;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月24日上午9:38:18
 */
public class HashMapTest {
	
	
	public static void main(String[] args) {
		//1.new出HashMap对象
		HashMap<String,Integer> maps = new HashMap<String,Integer>();
		//2.向HashMap中添加键值对元素
		maps.put("张三", 25);
		maps.put("李四", 24);
		maps.put("王五", 23);
		//3.通过key获取对应的value
		maps.get("王五");
	}

}
