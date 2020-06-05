package com.ws.computer.chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月3日上午10:59:25
 * 1.map集合 
 * 2.HashMap集合  和 TreeMap集合
 * 
 * 3.Properties
 */
public class MapTestThreeAndFour {
	
	
	public static void main(String[] args) {
		//1.Map集合，是个接口
		//2.Map集合是一个双列集合，一个元素对应两个值(key-value键值对)
		//3.Map集合中的key和value数据类型可以相同，也可以不同
		
		//4.HashMap:是Map接口的一个实现类
		
		 HashMap<String,String> hashMap = new HashMap<>();
		 //5.向集合中添加元素：put方法
		 hashMap.put("3111", "张三");
		 hashMap.put("3112", "李四");
		 hashMap.put("3113", "王五");
		 hashMap.put("3114", "赵六");
		 hashMap.put("3115", "董乐乐");
		 hashMap.put("3115", "董乐乐11");
		 hashMap.put("3116", "董乐乐11");
		 
		 //6注意：HashMap只关注key值
		 
		 //7.查询元素：get方法
		 //System.out.println(hashMap.get("3111"));
		 System.out.println(hashMap.get("3116"));
		 //8.HashMap集合，key不能重复，如果重复了，后面一个key会覆盖前面的key。 key具有唯一性
		 
		 hashMap.remove("3115");
		 System.out.println("3115:"+hashMap.get("3115"));
		 hashMap.remove("3116");
		 //9集合的大小：size()
		 System.out.println(hashMap.size());
		 
		 //10.HashMap集合的遍历
		 
		 //把HashMap集合转换为Set集合
		 Set<String> keySet = hashMap.keySet();
		 
		 Iterator<String> iterator = keySet.iterator();
		 
		 while(iterator.hasNext()){
			 String key = iterator.next();
			 String value = hashMap.get(key);
			 System.out.println(key+"--"+value); 
		 }
		 System.out.println("========================");
		 //Entry<String,String>
		 Set<Entry<String,String>> entrySet = hashMap.entrySet();
		 Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
		 while(iterator2.hasNext()){
			 Entry<String, String> entry  = iterator2.next();
			 String key = entry.getKey();
			 String value = entry.getValue();
			 System.out.println(key+"--"+value);
		 }
		 //11.hashMap是无序的。内部采用hash表结构
		 
		 //12.TreeMap: 1)可以把元素进行排序，  2）内部结构是红黑树，平衡二叉树
		 System.out.println("==================================");
		 TreeMap<String,String> treeMap = new TreeMap<>();
		 treeMap.put("3111", "张三");
		 treeMap.put("3113", "李四");
		 treeMap.put("3112", "王五");
		 treeMap.put("3115", "赵六");
		 treeMap.put("3114", "董乐乐");
		
		 //把HashMap集合转换为Set集合
		 Set<String> keySet1 = treeMap.keySet();
		 
		 Iterator<String> iterator1 = keySet1.iterator();
		 
		 while(iterator1.hasNext()){
			 String key = iterator1.next();
			 String value = treeMap.get(key);
			 System.out.println(key+"--"+value); 
		 }
		 
		 
		 
		 
		 
		
		
	}

}
