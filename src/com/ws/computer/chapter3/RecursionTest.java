package com.ws.computer.chapter3;

/**
 * 作者： 董乐强 
 * 邮箱：dlq_tinysoft@163.com 
 * 时间：2020年4月21日上午11:55:10 
 * 方法的递归
 *    1.递归的关系式  2.递归结束条件
 */
public class RecursionTest {

	// 例1：计算1-n之间所有自然数的和
	public int getSum(int n) {// 3

		if (n == 1) {
			return 1;
		} else {
			return n + getSum(n - 1);
		}

	}

	// 例2：计算1-n之间所有自然数的乘积:n!
	public int getSum1(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n * getSum1(n - 1);
		}

	}

}
