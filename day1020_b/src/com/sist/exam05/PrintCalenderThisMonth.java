package com.sist.exam05;

import java.util.Date;

public class PrintCalenderThisMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date today = new Date();
		int year = today.getYear();
		int month = today.getMonth();
		
		//�̴��� �޷��� ����ϱ� ����,
		//���� �̴��� 1���� ������ �ݿ����̶��
		//�տ� ��ĭ�� 5�� ����� �ְ� ��¥�� ����ؾ��Ѵ�
		//�׷��� �̴��� 1���� ������ �˱� ���� �̴��� 1����Date��ü�� ����
		Date startDate = new Date(year,month,1);
		
		int day = startDate.getDay();
		
		System.out.printf("%d�� %d��\n",year+1900,month+1);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		//�״��� 1���� ���ϸ�ŭ ��ĭ�� ���
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
