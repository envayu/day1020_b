package com.sist.exam05;

import java.util.Date;

public class System_CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long data = System.currentTimeMillis();
		//���糯¥�� �ð��� ������ �и��������� �о��
		
		System.out.println(data);
		//1634715380321
		//1634715417879
		//��¥�� ���� �뵵�ε� ���������, ���������뵵�ε� ����Ѵ�
		
		Date today = new Date(data);
		
		//long data2 = 1634715380321; 
		//�ڹٴ� �������� ���� ���� ������ int�� ���,
		//�׷��� ��Ʈ�� ������ �Ѿ��ٰ� ����������
		//���������� long�� ǥ���ϱ����� ���̻�l�� ���δ�
		long data2 = 1634715380321l;
		Date date = new Date(data2);
		System.out.printf("���ݽð�:%d��%d��%d��\n",today.getHours(),today.getMinutes(),today.getSeconds());
		System.out.printf("�Ʊ��ǽð�:%d��%d��%d��",date.getHours(),date.getMinutes(),date.getSeconds());
	}
}
