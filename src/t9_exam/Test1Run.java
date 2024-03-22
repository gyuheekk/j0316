package t9_exam;

import java.util.ArrayList;

public class Test1Run {
	public static void main(String[] args) {
		ArrayList<Test1VO> vos = new ArrayList<>();
		
		Test1VO vo = null;
		
		vo = new Test1VO();
		vo.setName("홍길동");
		vo.setAge(20);
		vo.setGender("남자");
		vo.setAddress("서울");
		vos.add(vo);
		
		vo = new Test1VO();
		vo.setName("김말숙");
		vo.setAge(29);
		vo.setGender("여자");
		vo.setAddress("청주");
		vos.add(vo);
		
		vo = new Test1VO();
		vo.setName("이기자");
		vo.setAge(33);
		vo.setGender("남자");
		vo.setAddress("제주");
		vos.add(vo);
		
		for(Test1VO v : vos) {
			System.out.println(v);
		}
	}
}
