package programmers;

import java.util.Arrays;

public class ArrayLength {
	// 프로그래머스 배열의 길이를 2의 거듭제곱으로 만들기
	    public int[] solution(int[] arr) {
	        int n = arr.length;
	        int newSize = 1;

	        while (newSize < n) {
	            newSize *= 2;
	        }

	        int[] result = Arrays.copyOf(arr, newSize);
	        return result;
	    }
}
