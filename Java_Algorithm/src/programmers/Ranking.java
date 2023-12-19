package programmers;

public class Ranking {
	    public int[] solution(int[][] score) {
	    	// 프로그래머스 등수 매기기
	        int n = score.length; 
	        int[] result = new int[n]; 

	        for (int i = 0; i < n; i++) {
	            double avg = (score[i][0] + score[i][1]) / 2.0; 
	            
	            int rank = 1; 


	            for (int j = 0; j < n; j++) {
	                if (i != j) { 
	                    double otherAvg = (score[j][0] + score[j][1]) / 2.0;

	                    if (avg < otherAvg) {
	                        rank++; 
	                    }
	                }
	            }

	            result[i] = rank; 
	        }

	        return result;
	    }
}
