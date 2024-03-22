package t4_Set;
//수정
import java.util.ArrayList;
import java.util.TreeSet;

/*
  	TreeSet : Set계열자료구조, 집합자료구조, HashSet과의 차이점 -> 순서가 없이 들어가있는 자료를 꺼낼때는 오름차순 정렬되어 꺼내준다.
 */
public class T2_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
//		for(int i=0; i<10; i++) {
//			treeSet.add((int)(Math.random()*100)+1);
//		}
//		treeSet.add(5);
//		treeSet.add(5);
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println("1.크기: " + treeSet.size());
		System.out.println("1.treeSet: " + treeSet);
		System.out.println();
		
		System.out.println("2.first() : " + treeSet.first());
		System.out.println("3.last() : " + treeSet.last());
		System.out.println("4.lower() - 검색자료보다 작은 것들 중 가장 큰 값 : " + treeSet.lower(26));
		System.out.println("5.higher() - 검색자료보다 큰 것들 중 가장 작은 값 : " + treeSet.higher(26));
		System.out.println("6.floor() - 같거나 작은것 : " + treeSet.floor(25));
		System.out.println("7.ceiling() - 같거나 큰것 : " + treeSet.floor(25));
		System.out.println();
		
		// pollFirst(): 원소들 중에서 작은 원소 값을 꺼내준다.
		System.out.println("8. size() : " + treeSet.size());
		System.out.print("8. pollForst : ");
		for(int i=0; i<25; i++) {
			System.out.print(treeSet.pollFirst() + " ");
		}
		System.out.println();
		
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		// pollLast(): 원소들 중에서 큰원소값 순으로 꺼내준다.
		System.out.print("9. size() : " + treeSet.size());
		System.out.print("9. pollLast() : ");
		for(int i=0; i<25; i++) {
			System.out.print(treeSet.pollLast() + " ");
		}
		System.out.println();
	}
}
