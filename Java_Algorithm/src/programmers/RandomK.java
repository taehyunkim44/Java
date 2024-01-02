package programmers;

import java.util.HashSet;
import java.util.Set;

public class RandomK {
	// 프로그래머스 무작위로 k개의 수 뽑
	    public int[] solution(int[] arr, int k) {
	       int[] result = new int[k];
	        Set<Integer> uniqueNumbers = new HashSet<>();

	        int idx = 0;
	        for (int num : arr) {
	            if (!uniqueNumbers.contains(num)) {
	                result[idx++] = num;
	                uniqueNumbers.add(num);
	                if (idx == k) {
	                    break;
	                }
	            }
	        }

	        while (idx < k) {
	            result[idx++] = -1;
	        }

	        return result;
	    }
}
