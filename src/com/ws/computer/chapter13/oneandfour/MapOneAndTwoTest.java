package com.ws.computer.chapter13.oneandfour;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月5日上午9:00:30
 */
public class MapOneAndTwoTest {
	
	
	
	public static void main(String[] args) {
		//1.Map集合： 1)Map是个接口， 2）是一个双列集合：一个元素包含两个值（一个key,一个value）key-value对的形式。
		//3）Map集合的key是不允许重复的，然后value是可以重复的。 学Map集合的时候，重点是关注key.
	
		//2.HashMap集合： 1）是Map接口的一个实现类。2)hashMap是无序的  3）key不能重复，具有唯一性。
		 HashMap<String,String> hashMap = new HashMap<>();
		//3.添加元素:key-value是一一对应的
		 hashMap.put("3111", "张三0");
		 hashMap.put("3110", "张三0");
		 hashMap.put("3113", "张三2");
		 hashMap.put("3118", "张三3");
		 hashMap.put("3116", "张三4");
		 hashMap.put("3116", "张三5");
		 //4.查找元素：通过key拿到value值
		 System.out.println(hashMap.get("3111"));
		 
		 //5.删除元素
		 hashMap.remove("3111");
		 
		 System.out.println(hashMap.get("3111"));
		 System.out.println("==========================");
		 //6.hashMap集合的遍历：本身无法遍历。hashMap可以转换为Set集合。
		 
		 //6.1遍历的第一种方式：把HashMap里面的key转换成Set集合
		 Set<String> keySet = hashMap.keySet();
		 //拿到set集合的迭代器
		 Iterator<String> iterator = keySet.iterator();
		 while(iterator.hasNext()){
			 //拿到hashMap集合的key
			 String key = iterator.next();
			 //拿到value值
			 String value = hashMap.get(key);
			 System.out.println(key+"--"+value);
		 }
		 System.out.println("================================");
		 //6.2第二种方式遍历hashMap集合
		 //hashMap转换为Set集合
		 Set<Entry<String,String>> entrySet = hashMap.entrySet();
		 //拿到迭代器进行遍历
		 Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
		 while(iterator2.hasNext()){
			 Entry<String, String> entry = iterator2.next();
			 String key = entry.getKey();
			 String value = entry.getValue();
			 System.out.println(key+"--"+value);
		 }
		 
		//7 TreeMap： 1）可以排序,指得是key。  2） 不能插入null元素
		 
		 TreeMap<String, String> treeMap = new TreeMap<>();
		 treeMap.put("3111", "张三0");
		 treeMap.put("3110", "张三0");
		 treeMap.put("3113", "张三2");
		 treeMap.put("3118", "张三3");
		 treeMap.put("3116", "张三4");
		 treeMap.put("3116", "张三5");
		 System.out.println("============================");
		 Set<Entry<String,String>> entrySet1 = treeMap.entrySet();
		 //拿到迭代器进行遍历
		 Iterator<Entry<String, String>> iterator3 = entrySet1.iterator();
		 while(iterator3.hasNext()){
			 Entry<String, String> entry = iterator3.next();
			 String key = entry.getKey();
			 String value = entry.getValue();
			 System.out.println(key+"--"+value);
		 }
		 
		 
		 
		 
		 treeMap.remove("3111");
		 
		 //treeMap.put(null, "");//key不能为null
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
