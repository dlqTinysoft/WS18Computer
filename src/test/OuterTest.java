package test;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午9:48:46
 */
public class OuterTest {
	
	public static void main(String[] args) {
		//new出静态内部类的对象
		Outer.Inner inner = new Outer.Inner();
		inner.method();
	}

}
