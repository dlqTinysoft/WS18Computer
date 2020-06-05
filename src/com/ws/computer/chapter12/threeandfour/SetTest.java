package com.ws.computer.chapter12.threeandfour;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月1日下午3:03:58
 */
public class SetTest {
	
	public static void main(String[] args) {
		//1.集合的遍历
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("张三");
		arrayList.add("李四");
		arrayList.add("王五");
		
		//Iterator：迭代器就是用来遍历集合的
		Iterator<String>  iterator = arrayList.iterator();
	
		//hasNext():判断集合中有没有元素了    next():取集合中的元素;
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//课外知识点：迭代器模式
		
		
		//2.Set集合：Set接口
		
		//3.HashSet
		System.out.println("===============================");
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("张三");
		hashSet.add("李四");
		hashSet.add("王五");
		hashSet.add("李四");
		hashSet.add("王五");
		hashSet.add(null);
		Iterator<String> iterator2 = hashSet.iterator();
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		System.out.println(hashSet.size());
		//3.HashSet集合： 1)元素存放是无顺序的   2）不能存放重复元素，如果元素重复自动舍去。
		//3)允许存入null元素，而且空元素也占用集合的大小
		
		
		//4.HashSet原理：哈希表结构
		
		
	}

}
