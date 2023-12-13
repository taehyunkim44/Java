package ex03;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		3. 아래의 입출력 예시처럼 카페메뉴를 만들고 출력하기
//		단,  HashMap에 저장하기(패키지명 : ex03, 클래스명 : Ex03)
//
//		카페 메뉴
//		아메리카노 2500
//		라떼 3500
//		모카 4500
//		바닐라 라떼 4500

		HashMap<String,Integer> cafeMenu = new HashMap<>(); 
		cafeMenu.put("아메리카노", 2500);
		cafeMenu.put("라떼", 3500);
		cafeMenu.put("모카", 4500);
		cafeMenu.put("바닐라 라떼", 4500);
		
//		[입출력 예시]
//		======카페 메뉴======
//		1. 아메리카노
//		2. 라떼
//		3. 모카
//		4. 바닐라 라떼
//		메뉴를 선택하세요>>> 2
//		2번 라떼를 선택하셨습니다. 라떼는 3500원입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("=====카페 메뉴======\n"
				+ "1. 아메리카노\n"
				+ "2. 라떼\n"
				+ "3. 모카\n"
				+ "4. 바닐라 라떼\n"
				+ "메뉴를 선택하세요>>>");
		int select = sc.nextInt();
		String coffee = null;
		int price = 0;
		switch(select) {
			case 1: 
					coffee = "아메리카노";
					price = cafeMenu.get(coffee);
					break;
			case 2: 
				coffee = "라떼";
				price = cafeMenu.get(coffee);
				break;
			case 3: 
				coffee = "모카";
				price = cafeMenu.get(coffee);
				break;
			case 4: 
				coffee = "바닐라 라떼";
				price = cafeMenu.get(coffee);
				break;
			default:
                System.out.println("잘못된 입력입니다.");
                break;
		}
	
		if(coffee != null) {
			System.out.println(select + "번 " + coffee +"를 선택하셨습니다. " + coffee + "는 " + price + "원입니다.");
		}
		

	}
}
