package baekJoon1;

import java.util.Scanner;

public class Problem5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] student = new boolean[31];

		for (int i = 1; i < 29; i++) {
			int submit = sc.nextInt();
			student[submit] = true;
		}
		for (int i = 1; i < student.length; i++) {
			if (!student[i])
				System.out.println(i);
		}

	}
}
