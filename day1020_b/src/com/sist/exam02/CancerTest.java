package com.sist.exam02;

import java.util.Date;
import java.util.Scanner;

public class CancerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, jumin;
		System.out.print("이름을 입력하세요===>");
		name = sc.next();
		System.out.print("주민번호를 입력하세요(하이픈 포함)===>");
		jumin = sc.next();
		//500101-1234567
		
		Date today = new Date();
		int thisYear = today.getYear() + 1900;
		int userYear = Integer.parseInt(jumin.substring(0, 2)) + 1900; 
		//endIndex는 불포함 "80"글자로 가져옴, 정수로 만들어야함 인티저에 파스인트로인해
		//"80" -> 80 숫자로된다
		int age = thisYear - userYear;
		char gender = jumin.charAt(7); //성별표시 1,2 인지
		String result = "위암, 간암";//암검진 항목
		
		System.out.println("=========================================");
		System.out.println("올해는"+thisYear+"입니다.");
		System.out.println("성함은"+name+"입니다.");
		System.out.println("출생년도"+userYear+"입니다.");
		System.out.println("나이"+age+"입니다.");
		System.out.println("성별은"+((gender == '1')?"남자":"여자")+"입니다.");
		System.out.println("=========================================");
		
		if (age >= 40 && thisYear % 2 == userYear % 2) {
			if(age>=50) {
				result += ", 대장암";
			}
			if(gender == '2') {
				result += ", 유방암, 자궁암";
			}
			System.out.println(name + "님은" + thisYear + "년도에 무료암검진 대상자입니다.");
			System.out.println("검진항목은" + result + "입니다.");
		}else {
			System.out.println(name + "님은" + thisYear + "년도에 무료암검진 대상자가 아닙니다.");
		}
	}
}
