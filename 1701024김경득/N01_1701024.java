/**
 * 이름:김경득
 * 학번:1701024
 */
package MidTest;

import java.util.*;

public class N01_1701024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//마름모 면적 구하기 (대각선*대각선)%2
		System.out.println("학번:1701024 이름:김경득 ");
		int x, y, s;
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 대각선의 길이를 입력하세요(0이상)");
		x = input.nextInt();
		System.out.println("두번째 대각선의 길이를 입력하세요(0이상)");
		y = input.nextInt();
		System.out.println("첫번째 대각선 길이는 "+x+" 두번째 대각선 길이는 "+y+"입니다");
		
		if(x<=0 || y<=0) {
			System.out.println("오류입니다");
		}else {
			s = (x * y) /2;
			System.out.println("마름모의 면적은 "+s);
		
		}
	}

}
