package com.ws.computer.chapter9.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月19日下午3:40:13
 * 定义了一个编译时异常
 */
public class DivideExcepton extends Exception {

	/**
	 * @param message
	 */
	public DivideExcepton(String message) {
		super(message);
	}

}
