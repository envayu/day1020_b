package com.sist.exam03;

import java.util.StringTokenizer;

public class StringTestSpilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "홍길동/20/서울/010-1234-5678";
		String []arr = data.split("/"); //"/"로 분리해줘 그걸 arr배열에 넣어줘
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("===============================");		
		StringTokenizer st = new StringTokenizer(data,"/");
		while(st.hasMoreTokens()) {  //토큰이 있는동안 반복실행
			String str = st.nextToken();
			System.out.println(str);
		}
	}
}
