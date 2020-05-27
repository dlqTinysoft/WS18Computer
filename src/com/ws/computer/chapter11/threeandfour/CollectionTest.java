package com.ws.computer.chapter11.threeandfour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月27日上午11:00:17
 */
public class CollectionTest {
	
	public static void main(String[] args) {
		
		//Collection
		
		//1.List接口
	
		
		//2.ArrayList  LinkedList
		
		
		//3.ArrayList的使用
	
		ArrayList<String> arrayList = new ArrayList<>();
		
		//3.1添加元素
		arrayList.add("张三");
		arrayList.add("李四");
		arrayList.add("王五");
		//System.out.println("==================");
		//System.out.println(arrayList.get(0));
		//System.out.println("==================");
		//3.2删除元素
		arrayList.remove(0);
		arrayList.remove(1);
		
		//3.3 获取元素
		System.out.println("======================");
		System.out.println(arrayList.get(0));
		System.out.println("=====================");
		
		
		//3.4覆盖元素
		arrayList.set(0, "董乐乐");
		
		//3.5 判断集合是否为空
		System.out.println(arrayList.isEmpty());
		
		//3.6.获取集合的大小
		System.out.println(arrayList.size());
		
		//3.7清空集合
		arrayList.clear();
		
		//3.8 ArrayList集合原理：内部实现是动态数组
		//删除元素：remove  添加元素：add   频繁移动元素
		//AarryList集合 get操作 时间复杂度是0（1） 查询很快。
		
		//3.9 LinkedList
		LinkedList<String> linkedList = new LinkedList<>();
		//3.10 添加元素
		linkedList.add("张三");
		linkedList.add(1, "李四");//指定该位置添加元素
		linkedList.addFirst("王五");
		linkedList.addLast("赵六");
		
		//3.11 删除 remove
		linkedList.remove();
		linkedList.remove(1);
		linkedList.removeFirst();
		linkedList.removeLast();
		
		//3.12 查询 get
		linkedList.get(0);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		//3.13 判断集合是否为空
		System.out.println(linkedList.isEmpty());
		
		//3.14 获取集合的大小
		System.out.println(linkedList.size());
		
		//3.15 覆盖指定位置的元素
		linkedList.set(2, "董乐乐");
		
		//3.16 LinkedList实现原理：内部实现是双向链表结构
		//LinkedList删除元素和增加元素，时间复杂度为 0(1)
		//查询操作 get(int index ) 查询的时间复杂度是0(n)
		
	}

}
