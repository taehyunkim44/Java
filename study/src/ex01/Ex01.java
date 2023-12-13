package ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
//	1.   1~20까지의 난수를 만들어 ArrayList에 5개만 저장한다. 
		ArrayList<Integer> result = new ArrayList<>();
//	참고: 난수만들 때는 Random 클래스의 객체를 만들어서 진행한다
		Random rd = new Random();
//	조건1) ArrayList의 객체에 5개의 난수(랜덤한 수)를 저장한다
		while(result.size() < 5) {
//		         	Random 클래스의 nextInt() 메소드 안에 값을 넣을 수 있다
//	nextInt(20) -> 0~19까지의 값 중 랜덤값 생성
//	nextInt(20)+1 -> 1~20까지의 값 중 랜덤값 생성
			int rdNum = rd.nextInt(20)+1;
//	조건2) 중복되는 수는 없도록 한다.
			if(!result.contains(rdNum)) {
				result.add(rdNum);
			}
		}
//	조건3) 내림차순 정렬한다.(높은숫자 -> 낮은숫자 순서로 정렬)
		Collections.sort(result, Collections.reverseOrder());

//		결과 출
		System.out.println(result);
	}
}
