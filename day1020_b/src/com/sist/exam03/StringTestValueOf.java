package com.sist.exam03;

public class StringTestValueOf {
	
	public static void pro(String str) { //String�� ���	
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���Ͱ��� � �޼ҵ�� String�� �Ű������� ���� �޼ҵ尡 �ִٰ�����
		
		int data = 2021;
		//������������ data�� ������ pro�� ȣ���ؾ� �ϴ� ��Ȳ�̶�� ����,
		//pro�� String�� �Ű������� ���� ������ �ٷ� ȣ�� �� ���� ����
		//data�� String���� ��ȯ�ؾ� �Ѵ�
		//pro(data); �̰� �ȵ�
		
		pro(String.valueOf(data));
		pro(data+"");		
	}
}
