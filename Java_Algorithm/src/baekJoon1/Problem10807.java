package baekJoon1;

import java.util.Scanner;

public class Problem10807 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;						 
        int N = sc.nextInt();
        int[] arr = new int[N];				

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();			 
        }
        int v = sc.nextInt();				 

        for(int i = 0; i < arr.length; i++){ 
            if(v == arr[i]){				 
                count++;
            }
        }
        System.out.println(count);
    }
}
