package com.ws.computer.chapter10;

import java.util.Random;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月20日上午8:17:09
 */
public class RandomTest {
	
	public static void main(String[] args) throws InterruptedException {
		Random rad = new Random();
		while(true){
			double x = rad.nextDouble();
			System.out.println(x);
			Thread.sleep(1000);
		}
		
	}

}
