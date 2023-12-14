package programmers;

import java.util.ArrayList;

public class MakeArray {
	 // 프로그래머스 배열 만들기4
	 public int[] solution(int[] arr) { 
	        ArrayList<Integer> list = new ArrayList<>();
	        int i = 0;
	        while(i < arr.length){
	            if(list.size() == 0){
	                list.add(arr[i]);
	                i++;
	            }else{
	                int last=list.get(list.size()-1);
	                if(last<arr[i]){
	                    list.add(arr[i]);
	                    i=i+1;
	                }else if (last >= arr[i]){
	                    list.remove(list.size()-1);
	                }
	            }
	        }
	        
	    return list.stream().mapToInt(Integer::intValue).toArray();
	    }

}
