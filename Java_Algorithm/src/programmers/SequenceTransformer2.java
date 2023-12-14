package programmers;

public class SequenceTransformer2 {
	// 프로그래머스 조건에 맞게 수열 변환하기 2
		   public int solution(int[] arr) {
		    int x = 0; 

		    while (true) {
		        int[] newArr = new int[arr.length]; 
		        boolean isEqual = true; 

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] >= 50 && arr[i] % 2 == 0) {
		                newArr[i] = arr[i] / 2;
		            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
		                newArr[i] = arr[i] * 2 + 1;
		            } else {
		                newArr[i] = arr[i];
		            }

		            if (isEqual && newArr[i] != arr[i]) {
		                isEqual = false;
		            }
		        }

		        if (isEqual) {
		            break;
		        }

		        arr = newArr.clone(); 
		        x++;
		    }

		    return x;
		}

}
