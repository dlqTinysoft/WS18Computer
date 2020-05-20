package com.ws.computer.chapter10.fixeandsix;

import java.util.Random;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日上午9:37:19
 * 生成随机数
 */
public class RandomTest {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		while(true){
			
			double d = rd.nextDouble();
			System.out.println(d);
			Thread.sleep(1000);
			
			
		}
	}

}
