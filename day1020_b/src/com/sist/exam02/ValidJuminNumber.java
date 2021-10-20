package com.sist.exam02;

import java.util.Scanner;

public class ValidJuminNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String jumin;
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(����������)===>");
		jumin = sc.next();
		
		int []n = {2,3,4,5,6,7,0,8,9,2,3,4,5}; //0��"-"�ڸ� ���߿� ���� �����Ұ�
		//800101-1234567 -> ������7������ ����(��Ű��� �ֹι�ȣ�� �׷��� ����Ѵٰ� ��...)
		//�ε����� 6��°(-)�� ��꿡 �������� �ʴ´�.
		//���ڿ��� ���̴�(-����) �� 14�ڸ�, �ٵ� ������ 7�� ������
		//0~12��°���� �ݺ����� ==> i < jumin.length()-1 // i <= jumin.length()-2
		
		int sum = 0;
		for(int i = 0 ; i < jumin.length()-1 ; i++) {
			if(i != 6) { //�������� �ƴҶ� 
				sum = sum + Integer.parseInt(jumin.charAt(i)+"") * n[i];
				//jumin.charAt(i)+""1��°�� ���ڷ� �������("")
				//chatAt()�� ����� char�̴�
				//char�� ���ڿ�(String)���� ����� ����
				//����""���� ���ϱ� ������ ���ڷ� �����
				//Integer.parseInt�� ����(String)�� ������ �ٲ�
			}
		}
		sum = sum % 11; //0~10
		sum = 11 - sum; //11-0 = 11, 11-1=10 ���ڸ��̴� 
		//�׷��� 10��0���� 11�� 1�� ǥ��
		if(sum ==10) {
			sum = 0;
		}
		if(sum == 11) {
			sum =1;
		}
		
		int check = Integer.parseInt(jumin.charAt(13)+"");
		
		if (sum == check) {
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ�Դϴ�");
		}else {
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ�� �ƴմϴ�");
		}

	}

}
