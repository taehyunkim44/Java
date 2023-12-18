package baekJoon1;

import java.util.Scanner;

public class Problem10809 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		int[] alphabet = new int[26];
		
		for(int i=0;i<alphabet.length;i++) {
			alphabet[i] = -1;
		}
        
        
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if(alphabet[ch - 'a'] == -1) {
				alphabet[ch - 'a'] = i;
			}
		}
		

		for(int val : alphabet) {
			System.out.print(val + " ");
		}
	}
}
