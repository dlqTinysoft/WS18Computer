package com.ws.computer.chapter13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月5日上午10:57:54
 */
public class MapTestEightAndSeven {
	
	public static void main(String[] args) {
		//1.Map集合： 1）是一个接口  2）是一个双列集合，一个元素包含两个值（一个key,一个value）
		
		//2.HashMap集合:1)hashMap中的key不能重复   2）HashMap也是无序的
		//hashMap的原理：哈希表结构
		HashSet<Object> hashSet = new HashSet<>();
		hashSet.add(null);
		
		HashMap<String,String> hashMap = new HashMap<>();
		
		hashMap.put("3111", "张三0");
		hashMap.put("3110", "张三1");
		hashMap.put("3112", "张三2");
		hashMap.put("3116", "张三3");
		hashMap.put("3116", "张三4");
		System.out.println(hashMap.get("3116"));
		//通过key来进行删除元素
		hashMap.remove("3111");
		//查询元素
		//String value = hashMap.get("3110");
		//System.out.println(value);
		System.out.println(hashMap.get("3111"));
		
		//遍历hashMap集合： 把HashMap集合转换成Set集合，然后进行遍历
		//遍历第一种方式
		Set<String> keySet = hashMap.keySet();
		System.out.println("==================");
		//拿到迭代器
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			String value = hashMap.get(key);
			System.out.println(key+"--"+value);
		}
		System.out.println("==============================");
		//第二种遍历方式：Entry类
		Set<Entry<String,String>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()){
			 Entry<String, String> entry = iterator2.next();
			 String key = entry.getKey();
			 String value = entry.getValue();
			 System.out.println(key+"--"+value);
		}
		//3.TreeMap集合:1)可以把元素进行排序（排序的是key） 2) 内部采用的平衡二叉树（红黑树结构）
		TreeMap<String,String> treeMap = new TreeMap<>();
		treeMap.put("3111", "张三");
		treeMap.put("3110", "李四");
		treeMap.put("3112", "王五");
		System.out.println("=======================");
		Set<String> keySet2 = treeMap.keySet();
		Iterator<String> iterator3 = keySet2.iterator();
		
		while(iterator3.hasNext()){
			String key = iterator3.next();
			String value = treeMap.get(key);
			System.out.println(key+"--"+value);
		}
		
		
		
		
	}

}
