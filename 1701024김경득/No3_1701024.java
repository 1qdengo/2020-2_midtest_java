/**
 * �̸�: ����
 * �й�: 1701024
 */
package MidTest;

import java.util.Scanner;

public class No3_1701024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� 5�� �Է¹޾� ��� ���� ���� ��� ����� ������ ������� �� �������� ���
		
		System.out.println("�й�:1701024 �̸�:���� ");

		int num1,num2,num3,num4,num5;	
		int pco = 0;	//���� ���� ī��Ʈ
		int mco = 0;	//���� ���� ī��Ʈ
		Scanner input = new Scanner(System.in);
		System.out.println("ù ��° ������ �Է��ϼ��� 0����");
		num1 = input.nextInt();
		if(num1==0) {
			System.out.println("0�� �Է��߾�� �ٽ� �Է��ϼ��� 0 ����");
			num1 = input.nextInt();
		}
		System.out.println("�� ��° ������ �Է��ϼ��� 0����");
		num2 = input.nextInt();
		if(num2==0) {
			System.out.println("0�� �Է��߾�� �ٽ� �Է��ϼ��� 0 ����");
			num2 = input.nextInt();
		}
		System.out.println("�� ��° ������ �Է��ϼ��� 0����");
		num3 = input.nextInt();
		if(num3==0) {
			System.out.println("0�� �Է��߾�� �ٽ� �Է��ϼ��� 0 ����");
			num3 = input.nextInt();
		}
		System.out.println("�� ��° ������ �Է��ϼ��� 0����");
		num4 = input.nextInt();
		if(num4==0) {
			System.out.println("0�� �Է��߾�� �ٽ� �Է��ϼ��� 0 ����");
			num4 = input.nextInt();
		}
		System.out.println("�ټ� ��° ������ �Է��ϼ��� 0����");
		num5 = input.nextInt();
		if(num5==0) {
			System.out.println("0�� �Է��߾�� �ٽ� �Է��ϼ��� 0 ����");
			num5 = input.nextInt();
		}
		
		System.out.println("�Է��� �� �߿��� ������ ");
		if(num1<0) {System.out.println(num1); mco++;}
		if(num2<0) {System.out.println(num2); mco++;}
		if(num3<0) {System.out.println(num3); mco++;}
		if(num4<0) {System.out.println(num4); mco++;}
		if(num5<0) {System.out.println(num5); mco++;}
		else {System.out.println("����");}
		
		System.out.println("�Է��� �� �߿��� ����� ");
		if(num1>0) {System.out.println(num1); pco++;}
		if(num2>0) {System.out.println(num2); pco++;}
		if(num3>0) {System.out.println(num3); pco++;}
		if(num4>0) {System.out.println(num4); pco++;}
		if(num5>0) {System.out.println(num5); pco++;}
		else {System.out.println("����");}

		
		if(mco>pco) {
			System.out.println("���� ������ ���� ��������"+(mco-pco)+"�� ��ŭ �� ����");
		}else {
			System.out.println("���� ������ ���� ��������"+(pco-mco)+"�� ��ŭ �� ����");
		}
	}
}
