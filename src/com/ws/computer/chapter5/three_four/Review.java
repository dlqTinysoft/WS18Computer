package com.ws.computer.chapter5.three_four;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日上午11:00:31
 */
public class Review {
	
	private String info;
	
	public static String name = "review";
	
	public static void method(){
		System.out.print("我是静态方法");
		//getInfo();
	}

	public String getInfo() {
		method();
		return info;
	}

	public void setInfo(String info) {
		System.out.println(this);
		this.info = info;//re.info
	}
	

}
