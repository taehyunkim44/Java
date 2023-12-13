package ex05;

import java.util.ArrayList;

public class Ex05 {
	public static void main(String[] args) {
//	5. 문자열 리스트를 생성하고, 중복되지 않는 모든 단어의 개수를 출력하기
		ArrayList<String> strList = new ArrayList<>();
		strList.add("나");
		strList.add("나");
		strList.add("너");
		strList.add("너");
		strList.add("누");		
		// 중복되지 않는 단어의 개수를 세기 위한 변수 count 초기화
        int count = 0;

        // 각 단어가 중복되지 않는지 체크
        for (int i = 0; i < strList.size(); i++) {
        	//중복 여부 
            boolean isDuplicate = false;
            for (int j = i + 1; j < strList.size(); j++) {
            	// 중복 일 경우 순회 break;
                if (strList.get(i).equals(strList.get(j))) {
                    isDuplicate = true;
                    break;
                }
            }
            // 중복 아닐 경우 count 증
            if (!isDuplicate) {
                count++;
            }
        }
		// 결과 출력
		System.out.println("중복되지 않는 모든 단어의 개수 : " + count);
	}
}
