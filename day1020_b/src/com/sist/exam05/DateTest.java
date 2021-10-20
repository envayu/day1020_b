package com.sist.exam05;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []arr = {"일","월","화","수","목","금","토"};
		
		Date today = new Date();
		int year = today.getYear() + 1900;
		int month = today.getMonth() + 1;
		int date = today.getDate();
		int hours = today.getHours();
		int minutes = today.getMinutes();
		int seconds = today.getSeconds();
		int day = today.getDay();
		//코드에 취소선이 있는거는 권장하지 않을 뿐 무시해도 된다
		
		String yoil = arr[day];
		
		System.out.printf("현재는 %d년 %d월 %d일(%s요일) %d시 %d분 %d초입니다\n",year,month,date,yoil,hours,minutes,seconds);		
		System.out.println("============================================");
		//나는 무슨요일에 태어났는지 알아보자
		//1995.7.9
		int birthYear = 1995;
		int birthMonth = 7;
		int birthDate = 9;
		
		Date Date2 = new Date(birthYear-1900,birthMonth-1,birthDate);
		int day2 = Date2.getDay();
		System.out.printf("내가 태어난날은 %s요일입니다",arr[day2]);
	}
}
