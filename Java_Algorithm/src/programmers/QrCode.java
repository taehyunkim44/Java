package programmers;

public class QrCode {
	// 프로그래머스 qr code
    public String solution(int q, int r, String code) {
        char[] arr = code.toCharArray();
        String result = "";
        for(int i=0;i<arr.length;i++){
            if(i % q == r){
                result += Character.toString(arr[i]);
            }
        }
        return result;
    }
}
