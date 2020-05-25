package com.ws.computer.chapter11;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * 作者： 董乐强 
 * 邮箱：dlq_tinysoft@163.com 
 * 时间：2020年5月23日下午4:21:07
 */
public class IteratorTest {

	public static void main(String[] args) {
		// 1.ArrayList集合，添加元素:add
		ArrayList<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		//获取迭代器
		Iterator<String> iterator = list.iterator();
		//遍历集合中的元素
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
