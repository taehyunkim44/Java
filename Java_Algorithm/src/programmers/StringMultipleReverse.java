package programmers;

public class StringMultipleReverse {
	// 문자열 여러 번 뒤집기
	public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray(); 
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            while (s < e) {
                char temp = charArray[s];
                charArray[s] = charArray[e];
                charArray[e] = temp;
                s++;
                e--;
            }
        }
        return new String(charArray);
    }
}
