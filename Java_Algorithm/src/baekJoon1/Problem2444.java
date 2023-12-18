package baekJoon1;

import java.util.Scanner;

public class Problem2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 

        // 위쪽
        for(int i = 1; i <= num ; i++) {
			for(int j = 0; j < num-i; j++) {
				System.out.print(" ");
			}	
			for(int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}		
			// 앞쪽 출력 후 줄바꿈 
			System.out.println();
		}
		
        // 아래쪽 
		for(int i = num-1; i >= 0 ; i--) {
			for(int j = 0; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			// 앞쪽 출력 후 줄바꿈 
			System.out.println();
		}
	}
    
}
