package com.ws.computer.chapter11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月25日上午9:15:24
 * 
 * java集合的特点：Collection
 * 
 * 
 */
public interface CollectionTest {
	
	public static void main(String[] args) {
		//1.Java中的集合就像一个容器，专门用来存储Java对象；
		//2.集合对象可以是任意的数据类型，并且长度可变
		//3.Collection是接口
		//4.Collection提供的API:add  remove 
		//5.创建集合对象 
    	// 使用多态形式
    	Collection<String> coll = new ArrayList<String>();
    	//6.使用API
    	// 添加功能  boolean  add(String s)
    	coll.add("小李广");
    	coll.add("扫地僧");
    	coll.add("石破天");
    	System.out.println(coll);
    	// boolean contains(E e) 判断o是否在集合中存在
    	System.out.println("判断  扫地僧 是否在集合中"+coll.contains("扫地僧"));
    	//boolean remove(E e) 删除在集合中的o元素
    	System.out.println("删除石破天："+coll.remove("石破天"));
    	System.out.println("操作之后集合中元素:"+coll);
    	// size() 集合中有几个元素
		System.out.println("集合中有"+coll.size()+"个元素");
		// Object[] toArray()转换成一个Object数组
    	Object[] objects = coll.toArray();
    	// 遍历数组
    	for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);
		}
		// void  clear() 清空集合
		coll.clear();
		System.out.println("集合中内容为："+coll);
		// boolean  isEmpty()  判断是否为空
		System.out.println(coll.isEmpty());  	
	}

}
