/**
 * �̸�: ����
 * �й�: 1701024
 */
package MidTest;

import java.util.Scanner;

public class No2_1701024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �Է¹޾� �� ���� ���� �ܿ� ��� if ���
		System.out.println("�й�:1701024 �̸�:���� ");

		int x;
		Scanner input = new Scanner(System.in);
		System.out.println("1~12���� �ϳ��� �Է��ϼ���");
		x = input.nextInt();
		System.out.println("�Է��� ���� "+x+"�� �Դϴ�");
		
		if(x<=0 || x>12) {
			System.out.println("�Է� �����Դϴ�");
		}else if(x==12 || x<=2) {
			System.out.println(x+"���� �ܿ��Դϴ�");
		}else if(x>=3 && x<=5) {
			System.out.println(x+"���� ���Դϴ�");
		}else if(x>=6 && x<=9) {
			System.out.println(x+"���� �����Դϴ�");
		}else {
			System.out.println(x+"���� �����Դϴ�");

		}
	}

}
