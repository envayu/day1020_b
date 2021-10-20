package com.sist.exam05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCalenderTest02 {
	public static void main(String[] args) {
		
	Calendar today = Calendar.getInstance();
	int year = today.get(Calendar.YEAR);
	int month = today.get(Calendar.MONDAY);
	int date = today.get(Calendar.DAY_OF_MONTH);
	
	//달력객체에 날짜셋팅
	today.set(year,(month-1),1);
	
	int startDayOfWeek = today.get(Calendar.DAY_OF_WEEK);
	
	System.out.printf("%d년 %d월\n",year,month+1);
	System.out.println("일\t월\t화\t수\t목\t금\t토");
	
	int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
	//날짜출력
	
	for(int i = 1; i<=lastDate[month]; i++) { //lastDate[month] 월에 마지막달을 맞춤
		System.out.print(i+"\t"); //\t탭공백만큼 띄움
		if ((i + startDayOfWeek)%7 ==0) { //한줄에7개만
			System.out.println();
		}
	}

	
	}
}
