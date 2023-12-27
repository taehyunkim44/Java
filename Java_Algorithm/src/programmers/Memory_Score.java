package programmers;

import java.util.HashMap;

public class Memory_Score {
	// 프로그래머스 추억점수
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            hm.put(name[i], yearning[i]);
        }

        int[] result = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            int totalYearning = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (hm.containsKey(photo[i][j])) {
                    totalYearning += hm.get(photo[i][j]);
                }
            }
            result[i] = totalYearning;
        }

        return result;
    }
}