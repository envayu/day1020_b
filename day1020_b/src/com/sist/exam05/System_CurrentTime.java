package com.sist.exam05;

import java.util.Date;

public class System_CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long data = System.currentTimeMillis();
		//현재날짜와 시간의 정보를 밀리세컨으로 읽어옴
		
		System.out.println(data);
		//1634715380321
		//1634715417879
		//날짜를 위한 용도로도 사용하지만, 난수만들기용도로도 사용한다
		
		Date today = new Date(data);
		
		//long data2 = 1634715380321; 
		//자바는 정수형의 값이 오면 무조건 int로 취급,
		//그래서 인트의 범위를 넘었다고 에러가난다
		//정수형값에 long을 표시하기위해 접미사l을 붙인다
		long data2 = 1634715380321l;
		Date date = new Date(data2);
		System.out.printf("지금시간:%d시%d분%d초\n",today.getHours(),today.getMinutes(),today.getSeconds());
		System.out.printf("아까의시간:%d시%d분%d초",date.getHours(),date.getMinutes(),date.getSeconds());
	}
}
