package baekJoon1;

import java.util.Scanner;

public class Problem1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] alphabet = new int[26];
		String word = sc.next();
		
		for(int i=0;i<word.length();i++) {
			if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') { 
				alphabet[word.charAt(i) - 'A']++;	
			}else {	
				alphabet[word.charAt(i) - 'a']++;
			}
		}
		
		int max = 0;
		char result = ' ';
		for(int i = 0;i<alphabet.length;i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				result = (char) (i + 65);
			}else if(alphabet[i] == max) {
				result = '?';
			}
		}
		
		System.out.println(result);
	}
}
