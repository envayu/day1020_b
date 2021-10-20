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
	
	System.out.printf("%d�� %d��\n",year,month+1);
	System.out.println("��\t��\tȭ\t��\t��\t��\t��");
	
	for(int i =1; i<=day ; i++) {
		System.out.print("\t");
	}
	
	int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
	//��¥���
	for(int i = 1; i<=lastDate[month]; i++) { //lastDate[month] ���� ���������� ����
		System.out.print(i+"\t"); //\t�ǰ��鸸ŭ ���
		if ((i + day)%7 ==0) { //���ٿ�7����
			System.out.println();
		}
	}
}


	
	}

