/**
 * 이름: 김경득
 * 학번: 1701024
 */
package MidTest;

import java.util.Scanner;

public class No3_1701024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 5개 입력받아 양수 음수 각각 출력 양수와 음수중 어느쪽이 더 많은가도 출력
		
		System.out.println("학번:1701024 이름:김경득 ");

		int num1,num2,num3,num4,num5;	
		int pco = 0;	//양의 정수 카운트
		int mco = 0;	//음의 정수 카운트
		Scanner input = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요 0제외");
		num1 = input.nextInt();
		if(num1==0) {
			System.out.println("0을 입력했어요 다시 입력하세요 0 제외");
			num1 = input.nextInt();
		}
		System.out.println("두 번째 정수를 입력하세요 0제외");
		num2 = input.nextInt();
		if(num2==0) {
			System.out.println("0을 입력했어요 다시 입력하세요 0 제외");
			num2 = input.nextInt();
		}
		System.out.println("세 번째 정수를 입력하세요 0제외");
		num3 = input.nextInt();
		if(num3==0) {
			System.out.println("0을 입력했어요 다시 입력하세요 0 제외");
			num3 = input.nextInt();
		}
		System.out.println("네 번째 정수를 입력하세요 0제외");
		num4 = input.nextInt();
		if(num4==0) {
			System.out.println("0을 입력했어요 다시 입력하세요 0 제외");
			num4 = input.nextInt();
		}
		System.out.println("다섯 번째 정수를 입력하세요 0제외");
		num5 = input.nextInt();
		if(num5==0) {
			System.out.println("0을 입력했어요 다시 입력하세요 0 제외");
			num5 = input.nextInt();
		}
		
		System.out.println("입력한 수 중에서 음수는 ");
		if(num1<0) {System.out.println(num1); mco++;}
		if(num2<0) {System.out.println(num2); mco++;}
		if(num3<0) {System.out.println(num3); mco++;}
		if(num4<0) {System.out.println(num4); mco++;}
		if(num5<0) {System.out.println(num5); mco++;}
		else {System.out.println("없다");}
		
		System.out.println("입력한 수 중에서 양수는 ");
		if(num1>0) {System.out.println(num1); pco++;}
		if(num2>0) {System.out.println(num2); pco++;}
		if(num3>0) {System.out.println(num3); pco++;}
		if(num4>0) {System.out.println(num4); pco++;}
		if(num5>0) {System.out.println(num5); pco++;}
		else {System.out.println("없다");}

		
		if(mco>pco) {
			System.out.println("음의 정수가 양의 정수보다"+(mco-pco)+"개 만큼 더 많다");
		}else {
			System.out.println("양의 정수가 음의 정수보다"+(pco-mco)+"개 만큼 더 많다");
		}
	}
}
