package programmers;

public class CharacterPosition {
	// 프로그래머스 캐릭터의 좌표
	public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        for (String move : keyinput) {
            switch (move) {
                case "up":
                    if (answer[1] < board[1] / 2) {
                        answer[1]++;
                    }
                    break;
                case "down":
                    if (answer[1] > -board[1] / 2) {
                        answer[1]--;
                    }
                    break;
                case "left":
                    if (answer[0] > -board[0] / 2) {
                        answer[0]--;
                    }
                    break;
                case "right":
                    if (answer[0] < board[0] / 2) {
                        answer[0]++;
                    }
                    break;
            }
        }
        
        return answer;
    }
}
