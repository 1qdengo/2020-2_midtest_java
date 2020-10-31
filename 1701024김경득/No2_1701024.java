/**
 * 이름: 김경득
 * 학번: 1701024
 */
package MidTest;

import java.util.Scanner;

public class No2_1701024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//월을 입력받아 봄 여름 가을 겨울 출력 if 사용
		System.out.println("학번:1701024 이름:김경득 ");

		int x;
		Scanner input = new Scanner(System.in);
		System.out.println("1~12월중 하나를 입력하세요");
		x = input.nextInt();
		System.out.println("입력한 월은 "+x+"월 입니다");
		
		if(x<=0 || x>12) {
			System.out.println("입력 오류입니다");
		}else if(x==12 || x<=2) {
			System.out.println(x+"월은 겨울입니다");
		}else if(x>=3 && x<=5) {
			System.out.println(x+"월은 봄입니다");
		}else if(x>=6 && x<=9) {
			System.out.println(x+"월은 여름입니다");
		}else {
			System.out.println(x+"월은 가을입니다");

		}
	}

}
