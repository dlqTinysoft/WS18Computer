package com.ws.computer.chapter12.sevenandeight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月3日下午4:21:26
 */
public class SetTest {
	
	
	public static void main(String[] args) {
		
		//1.集合的遍历
		//引入迭代器：Iterator
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("张三0");
		arrayList.add("张三1");
		arrayList.add("张三2");
		arrayList.add("张三3");
		
		//拿到迭代器:hasNext():boolean , next();
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//2.Set集合：接口
		//2.1 HashSet集合：
		 HashSet<Object> hashSet = new HashSet<>();
		 //2.2 添加元素
		 hashSet.add("张三");
		 hashSet.add("李四");
		 hashSet.add("王五");
		 hashSet.add("王五");
		 hashSet.add("李四");
		 hashSet.add("赵六");
		 hashSet.add("董乐乐");
		 //移除元素
		 //hashSet.remove("张三");
		 System.out.println("==============================");
		 //遍历HashSet集合中的元素
		 Iterator<Object> iterator2 = hashSet.iterator();
		 while(iterator2.hasNext()){
			 System.out.println(iterator2.next());
		 }
		 //集合大小
		 System.out.println(hashSet.size());
		 //hashSet的特点：1.不能存放重复元素，如果元素重复，自动舍弃。 2.存放的元素是无序的
		 //内部原理:哈希表结构
		 
		 //3.TreeSet集合：实现了Set接口。  1）原理：内部采用的是红黑树（平衡二叉树）2）可以把元素排序
		 //3）TreeSet集合不能存入null元素
		 System.out.println("===================================");
		  TreeSet<String> treeSet = new TreeSet<>();
		  //添加元素
		  treeSet.add("3111");
		  treeSet.add("3110");
		  treeSet.add("3115");
		  treeSet.add("3114");
		  treeSet.add("3118");
		  treeSet.add(null);//避免:TreeSet集合不能存入null，一定要小心。
		  
		  Iterator<String> iterator3 = treeSet.iterator();
		  
		  while(iterator3.hasNext()){
			  System.out.println(iterator3.next());
		  }
		 
		 
		
		
		
		
	}

}
