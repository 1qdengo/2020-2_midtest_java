/**
 * �̸�:����
 * �й�:1701024
 */
package MidTest;

import java.util.*;

public class N01_1701024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ���� ���ϱ� (�밢��*�밢��)%2
		System.out.println("�й�:1701024 �̸�:���� ");
		int x, y, s;
		Scanner input = new Scanner(System.in);
		
		System.out.println("ù��° �밢���� ���̸� �Է��ϼ���(0�̻�)");
		x = input.nextInt();
		System.out.println("�ι�° �밢���� ���̸� �Է��ϼ���(0�̻�)");
		y = input.nextInt();
		System.out.println("ù��° �밢�� ���̴� "+x+" �ι�° �밢�� ���̴� "+y+"�Դϴ�");
		
		if(x<=0 || y<=0) {
			System.out.println("�����Դϴ�");
		}else {
			s = (x * y) /2;
			System.out.println("�������� ������ "+s);
		
		}
	}

}
