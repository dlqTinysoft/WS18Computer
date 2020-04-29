package com.ws.computer.chapter5.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日上午8:53:03
 */
public class PersonTest {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p);
		p.setName("dlq");
		
		System.out.println(Person.info);
	    Person.method();
	    
	    //1.静态方法里面不能调用非静态方法
	    //2.非静态方法里面可以调用静态方法
	    
	    //===========方法的重载： 两同一个不同：
	    //重载的方法是在一类类中， 方法名必须相同
	    // 形参列表不同：1.参数个数不同  2. 参数类型不同
	    //注意：和方法的返回值，权限控制符 都没有关系
	    
		
		
		
		
		
	}

}
