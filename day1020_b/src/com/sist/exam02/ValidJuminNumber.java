package com.sist.exam02;

import java.util.Scanner;

public class ValidJuminNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String jumin;
		
		System.out.print("주민번호를 입력하세요(하이픈포함)===>");
		jumin = sc.next();
		
		int []n = {2,3,4,5,6,7,0,8,9,2,3,4,5}; //0은"-"자리 나중에 빼고 연산할것
		//800101-1234567 -> 마지막7은빼고 연산(위키백과 주민번호에 그렇게 계산한다고 함...)
		//인덱스가 6번째(-)는 계산에 참여하지 않는다.
		//문자열의 길이는(-포함) 총 14자리, 근데 마지막 7을 빼야해
		//0~12번째까지 반복실행 ==> i < jumin.length()-1 // i <= jumin.length()-2
		
		int sum = 0;
		for(int i = 0 ; i < jumin.length()-1 ; i++) {
			if(i != 6) { //하이픈이 아닐때 
				sum = sum + Integer.parseInt(jumin.charAt(i)+"") * n[i];
				//jumin.charAt(i)+""1번째를 문자로 가지고옴("")
				//chatAt()의 결과는 char이다
				//char를 문자열(String)으로 만들기 위해
				//빈문자""으로 더하기 함으로 문자로 만든다
				//Integer.parseInt는 문자(String)를 정수로 바꿈
			}
		}
		sum = sum % 11; //0~10
		sum = 11 - sum; //11-0 = 11, 11-1=10 두자리이다 
		//그래서 10은0으로 11은 1로 표현
		if(sum ==10) {
			sum = 0;
		}
		if(sum == 11) {
			sum =1;
		}
		
		int check = Integer.parseInt(jumin.charAt(13)+"");
		
		if (sum == check) {
			System.out.println("올바른 주민등록번호입니다");
		}else {
			System.out.println("올바른 주민등록번호가 아닙니다");
		}

	}

}
