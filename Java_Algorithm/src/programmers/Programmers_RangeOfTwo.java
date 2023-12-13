package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_RangeOfTwo {
	// 프로그래머스 2의 영역 
	 public int[] solution(int[] arr) {
         ArrayList<Integer> idx = new ArrayList<>();
         for(int i=0;i<arr.length;i++){
             if(arr[i] == 2){
                 idx.add(i);
             }
         }
         
          if(idx.isEmpty()){
              return new int[]{-1};
          }else{
              int start = idx.get(0);
              int end = idx.get(idx.size()-1);
              return Arrays.copyOfRange(arr,start,end+1);
          }
     }
}
