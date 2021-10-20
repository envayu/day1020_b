package com.sist.exam05;

import java.util.Calendar;
import java.util.Date;

public class PrintCalenderTest {
	//Calendar today = new Calendar;
	public static void main(String[] args) {
		
	Calendar today = Calendar.getInstance();
	int year = today.get(Calendar.YEAR);
	int month = today.get(Calendar.MONDAY);
	int date = today.get(Calendar.DAY_OF_MONTH);
	
	Date startDate = new Date(year,month,0);
	int day = startDate.getDay();
	
	System.out.printf("%d년 %d월\n",year,month+1);
	System.out.println("일\t월\t화\t수\t목\t금\t토");
	
	for(int i =1; i<=day ; i++) {
		System.out.print("\t");
	}
	
	int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
	//날짜출력
	for(int i = 1; i<=lastDate[month]; i++) { //lastDate[month] 월에 마지막달을 맞춤
		System.out.print(i+"\t"); //\t탭공백만큼 띄움
		if ((i + day)%7 ==0) { //한줄에7개만
			System.out.println();
		}
	}
}


	
	}

