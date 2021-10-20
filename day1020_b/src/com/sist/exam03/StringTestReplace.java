package com.sist.exam03;

import java.util.Scanner;

public class StringTestReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String data;
		System.out.println("문자열을 입력하세요");
		data = sc.next();
		data = data.replace("hello", "안녕");
		System.out.println(data);
	}
}
