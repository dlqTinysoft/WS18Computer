package com.ws.computer.chapter10.threeandfour;

import java.util.Random;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日上午11:37:06
 * 生成随机数的
 */
public class RandomTest {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		while(true){
			
			System.out.println(rd.nextDouble());//0到1之间的随机数
			
			//程序暂停1000ms
			Thread.sleep(1000);
			
			
		}
	}

}
