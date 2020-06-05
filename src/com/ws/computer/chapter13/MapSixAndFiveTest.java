package com.ws.computer.chapter13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月3日上午8:52:55
 */
public class MapSixAndFiveTest {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//1.map集合：它是一个双列集合（key-value对）
		//2.map集合：所有的操作都是基于key的
		
		//3.HashMap集合：
		//添加元素：put
		HashMap<String,String> hashMap = new HashMap<>();
		//4.key必须唯一的
		hashMap.put("2002", "张三");
		hashMap.put("2002", "李四");
		hashMap.put("2003", "王五");
		hashMap.put("2003", "董乐乐");
		hashMap.put("2004", "董乐乐");
		//5.查询元素:通过key拿到value值
		System.out.println(hashMap.get("2003"));
		//6.集合大小
		System.out.println(hashMap.size());
		//7.key-value必须是一一对应的
		System.out.println(hashMap.get("2004"));
		//8.map集合的value值可以重复，学map集合只关注key
		
		//9.删除元素
		hashMap.remove("2004");
		System.out.println("=====================");
		//10.遍历集合
		// 把hashMap转换为set集合:entrySet方法
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
		//keySet()方法-> set集合
		System.out.println("==================================");
		Set<String> keySet = hashMap.keySet();
		
		Iterator<String> iterator2 = keySet.iterator();
		while(iterator2.hasNext()){
			String key = iterator2.next();
			String value = hashMap.get(key);
			System.out.println(key+"--"+value);
		}
		//11.hashmap集合是随机放到，无序的。
		
		
		//12 TreeMap: 1)内部采用的红黑树  2)可以对元素key进行排序 
		System.out.println("===========================");
		 TreeMap<String, String> treeMap = new TreeMap<>();
		 treeMap.put("3111", "董乐乐");
		 treeMap.put("3110", "董乐1");
		 treeMap.put("3112", "董乐2");
		 treeMap.put("3118", "董乐3");
		 treeMap.put("3113", "董乐4");
		 
		 Set<String> keySet1 = treeMap.keySet();
			
			Iterator<String> iterator3 = keySet1.iterator();
			while(iterator3.hasNext()){
				String key = iterator3.next();
				String value = treeMap.get(key);
				System.out.println(key+"--"+value);
			}
			//13.Properties的使用
			System.out.println("=======================");
			Properties prop = new Properties();
			String path = "D:\\centos\\WSComputer-18\\src\\com\\ws\\computer\\chapter13\\";
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path+"dlq.properties"));
			try {
				prop.load(bufferedReader);
				String username = prop.getProperty("username");
				System.out.println(username);
				String password = prop.getProperty("password");
				System.out.println(password);
				String property = prop.getProperty("key");
				System.out.println(property);
			} catch (IOException e) {
				System.out.println("加载文件失败...");
			}
			
		
	}

}
