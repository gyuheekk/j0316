package t9_exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
  	그린중학교 1반에서 3반의 명단이 다음과 같다.
  	이때 ArrayList에 각 반별로 저장시켜놓고, ArrayList에 저장된 각 반의 자료를 출력시켜보자.
  	또, 반 입력하면 그 반의 학생들을 출력시켜보시오.
  	1반 : 홍길동, 김말숙, 이기자
  	2반 : 소나무, 대나무, 감나무, 밤나무
  	3반 : 오사랑, 하나로, 행복해
 */

public class Ex4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String[]> arr = new ArrayList<>();
		int choice = 0;
		
		while(true) {
		String[] green1 = {"홍길동","김말숙","이기자"};
		String[] green2 = {"소나무","대나무","감나무","이기자"};
		String[] green3 = {"오사랑","하나로","행복해"};
		arr.add(green1);
		arr.add(green2);
		arr.add(green3);
		
		System.out.println("반을 입력하세요?");
		System.out.println("1: 1반 | 2: 2반 | 3: 3반 | 4: 종료");
		System.out.print("==========================>>> ");
		choice = sc.nextInt();
		
		if(choice == 4) {
			System.out.println("프로그램을 종료합니다."); 
			break;
		}
		
		int i = 0;
		while(i<arr.get(choice-1).length) {
			System.out.print(arr.get(choice-1)[i] + " ");
			i++;
		}
		System.out.println();
		
		}
		sc.close();
	}
}