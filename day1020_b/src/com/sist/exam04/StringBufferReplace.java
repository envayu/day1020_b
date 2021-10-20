package com.sist.exam04;

public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer data = new StringBuffer("hello korea");
		//hello를 hi로 변경해보기
		
		//data.replace(0, 5, "hi");
		//System.out.println(data);
			
		String oldString = "hello";
		String newString = "hi";
		
		//data로부터 oldString의 위치를 알아내보자.
		int start = data.indexOf(oldString);
		
		int end = start + oldString.length();
		
		data.replace(start, end, newString);
		System.out.println(data);
	}
}
