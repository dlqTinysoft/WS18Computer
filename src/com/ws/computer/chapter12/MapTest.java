package com.ws.computer.chapter12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月1日上午8:05:49
 */
public class MapTest {
	
	
	
	
	
	/**
	 * 
	 */
	private void method() {
		
		//1.集合的遍历
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("张三");
		arrayList.add("李四");
		arrayList.add("王五");
		
		//迭代器：Iterator :hasNext()  next();
		Iterator<String> iterator = arrayList.iterator();
	
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//迭代器设计模式？
		
		//2.Set接口
		//HashSet
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("张三");
		hashSet.add("李四");
		hashSet.add("张三");
		hashSet.add("李四");
		
		Iterator<String> iterator2 = hashSet.iterator();
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//1.集合的遍历
		
				ArrayList<String> arrayList = new ArrayList<>();
				
				arrayList.add("张三");
				arrayList.add("李四");
				arrayList.add("王五");
				
				//迭代器：Iterator :hasNext()  next();
				Iterator<String> iterator = arrayList.iterator();
			
				while(iterator.hasNext()){
					System.out.println(iterator.next());
				}
				
				//迭代器设计模式？
				
				//2.Set接口
				//HashSet
				HashSet<String> hashSet = new HashSet<>();
				hashSet.add("张三");
				hashSet.add("李四");
				hashSet.add("张三");
				hashSet.add("李四");
				hashSet.add("王五");
				hashSet.add("王五");
				hashSet.add("王五");
				hashSet.add("王五");
				//1.不能存放重复元素，如果非要放重复元素，会舍弃。
				//2.不能存放空元素
				System.out.println("===================");
				Iterator<String> iterator2 = hashSet.iterator();
				while(iterator2.hasNext()){
					System.out.println(iterator2.next());
				}
				System.out.println(hashSet.size());
				
				System.out.println("====================");
				
				HashSet<String> hashSet1 = new HashSet<>();
				hashSet1.add("3111");
				hashSet1.add("3112");
				hashSet1.add("王五");
				hashSet1.add("王五");
				hashSet1.add("3113");
				//3.hashset里面存放的元素是无序的
				Iterator<String> iterator3 = hashSet1.iterator();
				while(iterator3.hasNext()){
					System.out.println(iterator3.next());
				}
				
				//4.HashSet底层结构：哈希表结构
				
				//5.TreeSet集合: 1)可以使元素有序  2）不能放入null元素   3）红黑树：平衡二叉树
				System.out.println("===============");
				TreeSet<Integer> treeSet = new TreeSet<>();
				treeSet.add(33);
				treeSet.add(23);
				treeSet.add(24);
				treeSet.add(28);
				//treeSet.add(null);//切记，不能这样写
				Iterator<Integer> iterator4 = treeSet.iterator();
				while(iterator4.hasNext()){
					System.out.println(iterator4.next());
				}
				
				
				
				
				
				
				
				
	
	
	}
}
