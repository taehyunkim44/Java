package programmers;

public class Sequence_RangeQuery4 {
		//	프로그래머스 수열과 구간 쿼리4
	    public int[] solution(int[] arr, int[][] queries) {
	        for(int i=0;i<queries.length;i++){
	            int s = queries[i][0];
	            int e = queries[i][1];
	            int k = queries[i][2];
	            for(int j=s;j<e+1;j++){
	                if(j % k == 0){
	                    arr[j]++;
	                }
	            }
	        }
	        return arr;
	    }
}
