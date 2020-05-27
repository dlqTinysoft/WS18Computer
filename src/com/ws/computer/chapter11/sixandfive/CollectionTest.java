package com.ws.computer.chapter11.sixandfive;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月27日上午8:57:58
 */
public class CollectionTest {

	
	 public static void main(String[] args) {
		//1.集合的顶级接口
		//Collection
		 
		//2.ArrayList  LinkedList 两个集合
		 //ArrayList实现原理是数组
		 //LinkedList的实现原理是链表
		 
		
	   //3.ArrayListAPi的使用
		 ArrayList<String> arrayList = new ArrayList<String>();
		 
		 //3.1添加元素
		 arrayList.add("张三");
		 arrayList.add("李四");
		 arrayList.add("王五");
		 
		 //3.2取出元素
		 System.out.println(arrayList.get(0));
		 System.out.println(arrayList.get(1));
		 System.out.println(arrayList.get(2));
		 
		 //3.3删除元素
		 arrayList.remove(0);
		 arrayList.remove(1);
		 System.out.println("==============");
		 System.out.println(arrayList.get(0));
		 
		 //3.4.覆盖指定位置的元素
		 arrayList.set(0, "董乐乐");
		 System.out.println(arrayList.get(0));
		 System.out.println("================");
		 //System.out.println(arrayList.get(1));
		 
		 //3.5 集合判空
		 arrayList.remove(0);
		 System.out.println(arrayList.isEmpty());
		 
		
		 
		 
		 //4.ArrayList的原理 ： 内部是动态数组结构
		 // 增加元素和删除元素 非常耗时的   时间复杂度0（n）。 查询元素：时间复杂度 0(1)
		 //5.LinkedList集合：链表
		 LinkedList<String> linkedList = new LinkedList<>();
		 
		 linkedList.add("张三");
		 linkedList.addFirst("李四");
		 linkedList.addLast("王五");
		 linkedList.removeFirst();
		 linkedList.removeLast();
		 System.out.println(linkedList.getFirst());
		 System.out.println(linkedList.getLast());
		 linkedList.set(0, "董乐乐");
		 
		 //6.LinkedList集合内部实现：双向链表结构
		 
		 
		 
		 
		 
		 
	}
}
