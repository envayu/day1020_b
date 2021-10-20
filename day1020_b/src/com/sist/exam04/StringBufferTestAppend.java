package com.sist.exam04;

public class StringBufferTestAppend {
	
	public static void pro(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer data = new StringBuffer("hello");
		String msg = "java";
		int year = 2021;
		boolean flag = true;
		
		data.append("/"); // "/"를 추가
		data.append(msg); //msg를 추가
		data.append("/"); // "/"를 추가
		data.append(year); //year를 추가
		data.append("/"); // "/"를 추가
		data.append(flag); //flag를 추가
		
		pro(String.valueOf(data)); 
		pro(data.toString());
	
	}
}
