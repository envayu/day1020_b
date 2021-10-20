package com.sist.exam03;

public class StringTestValueOf {
	
	public static void pro(String str) { //String만 취급	
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//위와같이 어떤 메소드는 String만 매개변수로 갖는 메소드가 있다고하자
		
		int data = 2021;
		//정수형데이터 data를 가지고 pro를 호출해야 하는 상황이라고 가정,
		//pro는 String을 매개변수로 갖기 때문에 바로 호출 할 수는 없고
		//data를 String으로 변환해야 한다
		//pro(data); 이건 안됨
		
		pro(String.valueOf(data));
		pro(data+"");		
	}
}
