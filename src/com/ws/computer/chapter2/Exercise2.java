package com.ws.computer.chapter2;

/**
 * @author 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 2020年4月12日下午11:02:04
 */
public class Exercise2 {
	
	public static void main(String[] args) {
		//1.封装请求报文
		Request req = new Request();
		req.setAppId("00125");
		req.setParkId("01546");
		//2.发送报文,并同步接收响应
		Response resp = send(req);
		//3.解析报文
		if("0000".equals(resp.getResultCode())){
			System.out.println("查询到停车场");
		}else{
			System.out.println("该停车场不存在");
		}
	}

	/**
	 * @param req
	 */
	private static Response send(Request req) {
		// TODO Auto-generated method stub
		Response resp = new Response();
		resp.setMessage("查询成功");
		resp.setResultCode("0000");
		return resp;
	}

}
