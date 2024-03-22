package t9_exam;

import java.util.TreeSet;

// Lotto 6개의 당첨번호를 중복을 배제해서 오름차순 출력하시오.(단, set계열 객체 사용)
public class Ex3 {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		
		for(int num : lotto) {
			System.out.print(num + " ");
		}
		
	}
}
