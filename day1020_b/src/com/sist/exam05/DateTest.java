package com.sist.exam05;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []arr = {"��","��","ȭ","��","��","��","��"};
		
		Date today = new Date();
		int year = today.getYear() + 1900;
		int month = today.getMonth() + 1;
		int date = today.getDate();
		int hours = today.getHours();
		int minutes = today.getMinutes();
		int seconds = today.getSeconds();
		int day = today.getDay();
		//�ڵ忡 ��Ҽ��� �ִ°Ŵ� �������� ���� �� �����ص� �ȴ�
		
		String yoil = arr[day];
		
		System.out.printf("����� %d�� %d�� %d��(%s����) %d�� %d�� %d���Դϴ�\n",year,month,date,yoil,hours,minutes,seconds);		
		System.out.println("============================================");
		//���� �������Ͽ� �¾���� �˾ƺ���
		//1995.7.9
		int birthYear = 1995;
		int birthMonth = 7;
		int birthDate = 9;
		
		Date Date2 = new Date(birthYear-1900,birthMonth-1,birthDate);
		int day2 = Date2.getDay();
		System.out.printf("���� �¾���� %s�����Դϴ�",arr[day2]);
	}
}
