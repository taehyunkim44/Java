package programmers;

public class Sequence_RangeQuery2 {
	// 프로그래머스 수열과 구간 쿼리2
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		int s = 0;
		int e = 0;
		int k = 0;
		int max = 0;
		for (int i = 0; i < queries.length; i++) {
			s = queries[i][0];
			e = queries[i][1];
			k = queries[i][2];

			int minMore = Integer.MAX_VALUE;

			for (int j = s; j <= e; j++) {
				if (arr[j] > k && arr[j] < minMore) {
					minMore = arr[j];
				}

				if (minMore != Integer.MAX_VALUE) {
					answer[i] = minMore;
				} else {
					answer[i] = -1;
				}
			}
		}
		return answer;
	}
}
