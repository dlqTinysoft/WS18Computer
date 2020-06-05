package com.ws.computer.chapter13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月2日下午11:47:26
 */
public class MapTest {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("3111", "张三");
		hashMap.put("3112", "李四");
		hashMap.put("3112", "王五");
		hashMap.put("3112", "赵六");
		hashMap.put("3112", "田七");
		System.out.println(hashMap.get("31110"));
		
		Set<String> sets =  hashMap.keySet();
		Iterator<String> iterator = sets.iterator();
		StringBuffer sbf = new StringBuffer();
		while(iterator.hasNext()){
			String key = iterator.next();
			String value = hashMap.get(key);
			sbf.append("key=").
			append(key).
			append(" value=").
			append(value).append("\n");
		}
		System.out.println(sbf.toString());
		System.out.println("===============================");
		sbf = new StringBuffer();
		Set<Entry<String, String>> entries = hashMap.entrySet();
		Iterator<Entry<String, String>> iterator2 = entries.iterator();
		while(iterator2.hasNext()){
			Entry<String, String> entry = iterator2.next();
			String key = entry.getKey();
			String value = entry.getValue();
			sbf.append("key=").append(key)
			.append(" value=").append(value).append("\n");
		}
		System.out.println(sbf.toString());
		
		//=======================================treeMap==================
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		//1.自然排序
		treeMap.put(2001, "张三");
		treeMap.put(2002, "李四");
		treeMap.put(2000, "王五");
		
		Set<Entry<Integer, String>> treeMapEntries = treeMap.entrySet();
		//自然排序
		Iterator<Entry<Integer, String>> iterator3 = treeMapEntries.iterator();
		while(iterator3.hasNext()){
			Entry<Integer, String> entry = iterator3.next();
			System.out.println("key: "+entry.getKey() +" value: "+entry.getValue());
		}
		
		//定制排序
		TreeMap<Student,String> treeMap1 = new TreeMap<>();
		treeMap1.put(new Student("3111", "张三"), "");
		treeMap1.put(new Student("3110", "李四"), "");
		treeMap1.put(new Student("3112", "王五"), "");
		treeMap1.remove(new Student("3112", "王五"));//移除元素
           Set<Entry<Student, String>> treeMapEntries1 = treeMap1.entrySet();
		
		Iterator<Entry<Student, String>> iterator4 = treeMapEntries1.iterator();
		while(iterator4.hasNext()){
			Entry<Student, String> entry = iterator4.next();
			System.out.println("key: "+entry.getKey() +" value: "+entry.getValue());
		}
		
		
		//Properties的使用
		Properties prop = new Properties();
		String path = "D:\\centos\\WSComputer-18\\src\\com\\ws\\computer\\chapter13\\";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path+"dlq.properties"));
		try {
			prop.load(bufferedReader);
			String username = prop.getProperty("username");
			System.out.println(username);
			String password = prop.getProperty("password");
			System.out.println(password);
		} catch (IOException e) {
			System.out.println("加载文件失败...");
		}
		
		
		
		
		
		
	}

}
