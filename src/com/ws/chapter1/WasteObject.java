package com.ws.chapter1;
/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 单位：武汉生物工程学院
 * 引用作为参数传递
 */
public class WasteObject {
	public static void main(String[] args) {
		getPhone();
		Phone phone = new Phone();
		phone.brand = "华为";
		phone.price = 4999;
		phone = null;
	}
	//垃圾对象：该方法释放后，没有引用指向new Phone()
	private static void getPhone() {
		Phone phone = new Phone();
		phone.brand = "华为";
		phone.price = 4999;
	}
}
