package ex02;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
//		2. 오토박싱(AutoBoxing)과 오토언박싱(AutoUnboxing)을 이용하여 코드 작성하기
//		(패키지명 ex02, 클래스명 Ex02)
//		1) ArrayList 클래스를 이용하여 정수 값만 저장하는 리스트 iList를 생성합니다.
		ArrayList<Integer> iList = new ArrayList<>();
//		2) iList에 1, 2, 3, 4, 5 값을 추가합니다.
		for(int i=1;i<6;i++) {
			iList.add(i);
		}
//		3) iList의 첫 번째 값을 출력합니다.
		System.out.println("첫 번째 값 : " + iList.get(0));
//		4) iList의 마지막 값을 출력합니다.
		System.out.println("마지막 값 : " + iList.get(iList.size()-1));
//		5) iList에서 3을 제거합니다.
		iList.remove(Integer.valueOf(3));
//		6) iList의 크기를 출력합니다.
		System.out.println("iList의 크기 : " + iList.size());
//		7) iList에 10, 20, 30 값을 추가합니다.
		for(int i=10;i<31;i+=10) {
			iList.add(i);
		}
//		8) iList의 모든 값을 출력합니다.
		for(int i=0;i<iList.size();i++) {
			System.out.println( i + 1 + "번째 값 : " +iList.get(i));
		}
//		9) iList의 모든 값을 더한 결과를 출력합니다.
		int sum = 0;
		for(int i=0;i<iList.size();i++) {
			sum += iList.get(i);
		}
		
		System.out.println("iList의 모든 값을 더한 결과 : " + sum);
	}
}
