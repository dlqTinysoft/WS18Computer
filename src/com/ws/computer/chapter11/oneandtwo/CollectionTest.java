package com.ws.computer.chapter11.oneandtwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月29日上午8:53:11
 */
public class CollectionTest {
	
	
	
	public static void main(String[] args) {
		
		//1.Collection
		//Collection
		
		//2.ArrayList集合
		
		//3.ArrayList常见API的使用
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//4.向ArrayList中添加元素
		arrayList.add("张三");
		arrayList.add("李四");
		arrayList.add("王五");
		
		//在数组的指定位置添加元素（慎用）
		//arrayList.add(1, "赵六");
		
		//5.获取元素
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println("=======================");
		//6.删除元素
		arrayList.remove(0);
		arrayList.remove(1);
		System.out.println(arrayList.get(0));
		
		//7.判空操作
		System.out.println(arrayList.isEmpty());
		
		//8.集合的大小
		System.out.println(arrayList.size());
		
		//9.替换元素
		arrayList.set(0, "赵六");
		System.out.println(arrayList.get(0));
		
		
		//10.ArrayList内部结构：动态数组结构
		//10.1 ArrayList删除元素的时候，需要频繁的移动元素
		//10.2 ArrayList增加元素的时候，需要频繁的移动元素
		//10.3 ArrayList查询非常快，时间复杂度为0(1)
		
		//=====================================
		//1.LinkedList集合
		
		
		//2.LinkedList常见API
		
		LinkedList<String> linkedList = new LinkedList<String>();
		//3.增加元素
		linkedList.add("张三");
		linkedList.addFirst("李四");
		linkedList.addLast("王五");
		//4.删除操作
		linkedList.remove(0);
		linkedList.removeFirst();
		linkedList.removeLast();
		//5.修改操作
		linkedList.set(0, "赵六");
		//6.查询操作
		linkedList.getFirst();
		linkedList.getLast();
		linkedList.get(0);
		//7.判空
		System.out.println(linkedList.isEmpty());
		//8.大小
		System.out.println(linkedList.size());
		
		//9.LinkedList的原理，内部结构：双向链表结构
		//9.1LinkedList增加元素和删除元素，时间复杂度是0（1） 很快
		//9.2 查询元素：时间复杂度是0（n） 很慢
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
