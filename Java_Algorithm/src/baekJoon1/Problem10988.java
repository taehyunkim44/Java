package baekJoon1;

import java.util.Scanner;

public class Problem10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();	
		boolean result = true;
			

		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				result = false;
				break;
			}
		}

		if (result) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
