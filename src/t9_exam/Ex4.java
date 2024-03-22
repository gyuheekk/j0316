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

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String[]> arr = new ArrayList<>();
		int choice = 0;
		
		while(true) {
			System.out.println("반을 입력하세요?");
			System.out.println("1: 1반 | 2: 2반 | 3: 3반 | 4: 종료");
			System.out.print("==========================>>> ");
			choice = sc.nextInt();
			
			String[] green1 = new String[3];
			green1[0] = "홍길동"; 
			green1[1] = "김말숙"; 
			green1[2] = "이기자"; 
			arr.add(green1);
			
			String[] green2 = new String[4];
			green2[0] = "소나무";
			green2[1] = "대나무";
			green2[2] = "감나무";
			green2[3] = "밤나무";
			arr.add(green2);
			
			String[] green3 = new String[3];
			green3[0] = "오사랑";
			green3[1] = "하나로";
			green3[2] = "행복해";
			arr.add(green3);
		
				switch(choice) {
					case 1:
						System.out.println("#1반 명단입니다#");
						System.out.print(arr.get(0)[0] + " ");	
						System.out.print(arr.get(0)[1] + " ");	
						System.out.println(arr.get(0)[2] + " ");	
						System.out.println("----------------");
						break;
						
					case 2:
						System.out.println("#2반 명단입니다#");
						System.out.print(arr.get(1)[0] + " ");	
						System.out.print(arr.get(1)[1] + " ");	
						System.out.print(arr.get(1)[2] + " ");	
						System.out.println(arr.get(1)[3] + " ");	
						System.out.println("----------------------");
						break;
					
					case 3:
						System.out.println("#3반 명단입니다#");
						System.out.print(arr.get(2)[0] + " ");	
						System.out.print(arr.get(2)[1] + " ");	
						System.out.println(arr.get(2)[2] + " ");	
						System.out.println("----------------");
						break;
						
					case 4:
							System.out.println("프로그램을 종료합니다.");
							break;
				}
				if(choice == 4) break; 
		}
		sc.close();
	}
}