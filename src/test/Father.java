package test;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年6月5日下午4:21:52
 */
public class Father {
	
	private String name ;
	private String certId;
	
	public Father(String name ,String certId){
		this.name = name;
		this.certId = certId;
		System.out.println(name);
		System.out.println(certId);
	}

}
