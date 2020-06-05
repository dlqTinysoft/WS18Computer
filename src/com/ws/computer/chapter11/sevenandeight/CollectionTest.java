package com.ws.computer.chapter11.sevenandeight;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月29日上午10:56:17
 */
public class CollectionTest {
	
	public static void main(String[] args) {
		//1.集合，什么是集合呢？ ：用来存放对象的容器
		
		//2.Collection接口
		
		
		//3.ArrayList 和 LinkedList集合
		
		//ArrayList常见的API
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//4.向集合中添加元素
		arrayList.add("张三");
		arrayList.add("李四");
		arrayList.add("王五");
		
		//5.删除集合中的元素
		arrayList.remove(0);
		arrayList.remove(1);
		
		//6.查询集合中的元素
		System.out.println(arrayList.get(1));
		
		//7.修改元素
		arrayList.set(0, "赵六");
		
		//8.判断集合是否为空
		System.out.println(arrayList.isEmpty());
		
		//9.集合的大小
		System.out.println(arrayList.size());
		
		//10.ArrayList的内部结构，以及原理： 动态数组实现的集合
		//10.1 ArrayList删除元素，需要频繁的移动元素。
		//10.2 向ArrayList的指定位置添加元素，需要频繁的移动元素。
		//10.3 ArrayList查询数据很快，时间复杂度 0(1)
		
		//=================================
		//1.LinkedList集合的常见api操作
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//2.增加操作
		linkedList.add("张三");
		linkedList.addLast("李四");
		linkedList.addFirst("王五");
		
		//3.删除操作
		linkedList.remove();
		linkedList.remove(0);
		linkedList.removeLast();
		linkedList.removeFirst();
		//linkedList.removeAll(c)
		//4.修改操作
		linkedList.set(0, "赵六");
		//查询
		String str = linkedList.get(0);
		linkedList.getFirst();
		linkedList.getLast();
		//5.集合大小
		System.out.println(linkedList.size());
		//6.判断集合是否为空
		System.out.println(linkedList.isEmpty());
		
		//7.LinkedList集合的原理： 双向链表结构
		//7.1, LinkedList集合删除元素和增加元素， 时间复杂度都是0(1), 
		//适合频繁从集合中删除元素和添加元素的业务
		//7.2LinkedList集合查询元素的时间复杂度是0(n)，比较耗时。
		
		
		
	}

}
