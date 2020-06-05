package com.ws.computer.chapter12;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月1日上午11:08:30
 */
public class MapTest1 {
	
	public static void main(String[] args) {
		//放入的元素不能重复，重复了之后就会被自动舍弃
		HashSet<String> hashSet = new HashSet<String>();
	      hashSet.add("张三");
	      hashSet.add("李四");
	      hashSet.add("王五");
	      hashSet.add("王五");
	      hashSet.add("王五");
	      hashSet.add("王五");
	      hashSet.add(null);//hashset可以放null元素
	      Iterator<String> iterator2 = hashSet.iterator();
		    while(iterator2.hasNext()){
		    	System.out.println(iterator2.next());
		    }
		    System.out.println(hashSet.size());
		    
		    System.out.println(hashSet.contains("王五"));
		    hashSet.remove("李四");
		    System.out.println(hashSet.size());
	}

}
