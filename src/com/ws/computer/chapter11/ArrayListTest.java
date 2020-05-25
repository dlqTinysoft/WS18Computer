package com.ws.computer.chapter11;

import java.util.ArrayList;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月23日上午10:04:33
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//1.ArrayList集合，添加元素:add
		ArrayList<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		//2.ArrayList集合，删除元素：remove
		list.remove(0);
		//3.ArrayList集合，获取元素：get
		System.out.println(list.get(1));
		//4.ArrayList集合，覆盖元素：set
		list.set(0, "董乐乐");
	}
}
