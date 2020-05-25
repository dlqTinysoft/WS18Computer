package com.ws.computer.chapter11;

import java.util.LinkedList;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月23日上午10:56:20
 */
public class LinkedListTest {
	
	public static void main(String[] args) {
		//LinedList使用示列
		LinkedList<String> list = new LinkedList<String>();
		//1.向集合中添加元素
		list.add("张三");
		list.add("李四");
		//2.获取集合中的首元素
		System.out.println(list.getFirst());
		//3.获取集合中的尾元素
		System.out.println(list.getLast());
		//4.删除集合中的首元素
		list.removeFirst();
		//5.删除集合中的尾元素
		list.removeLast();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}

}
