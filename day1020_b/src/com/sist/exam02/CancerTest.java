package com.sist.exam02;

import java.util.Date;
import java.util.Scanner;

public class CancerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, jumin;
		System.out.print("�̸��� �Է��ϼ���===>");
		name = sc.next();
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(������ ����)===>");
		jumin = sc.next();
		//500101-1234567
		
		Date today = new Date();
		int thisYear = today.getYear() + 1900;
		int userYear = Integer.parseInt(jumin.substring(0, 2)) + 1900; 
		//endIndex�� ������ "80"���ڷ� ������, ������ �������� ��Ƽ���� �Ľ���Ʈ������
		//"80" -> 80 ���ڷεȴ�
		int age = thisYear - userYear;
		char gender = jumin.charAt(7); //����ǥ�� 1,2 ����
		String result = "����, ����";//�ϰ��� �׸�
		
		System.out.println("=========================================");
		System.out.println("���ش�"+thisYear+"�Դϴ�.");
		System.out.println("������"+name+"�Դϴ�.");
		System.out.println("����⵵"+userYear+"�Դϴ�.");
		System.out.println("����"+age+"�Դϴ�.");
		System.out.println("������"+((gender == '1')?"����":"����")+"�Դϴ�.");
		System.out.println("=========================================");
		
		if (age >= 40 && thisYear % 2 == userYear % 2) {
			if(age>=50) {
				result += ", �����";
			}
			if(gender == '2') {
				result += ", �����, �ڱþ�";
			}
			System.out.println(name + "����" + thisYear + "�⵵�� ����ϰ��� ������Դϴ�.");
			System.out.println("�����׸���" + result + "�Դϴ�.");
		}else {
			System.out.println(name + "����" + thisYear + "�⵵�� ����ϰ��� ����ڰ� �ƴմϴ�.");
		}
	}
}
