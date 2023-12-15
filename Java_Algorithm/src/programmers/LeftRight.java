package programmers;

import java.util.ArrayList;

public class LeftRight {
	// 프로그래머스 왼쪽 오른쪽
	  public String[] solution(String[] str_list) {
	        ArrayList<String> list = new ArrayList<>();
	        
	        String result[];
	        for(int i =0; i<str_list.length;i++){
	            if(str_list[i].equals("l")){
	                for(int j=0;j<i;j++){
	                    list.add(str_list[j]);
	                }
	                break;
	            }else if(str_list[i].equals("r")){
	                for(int j=i+1;j<str_list.length;j++){
	                    list.add(str_list[j]);
	                }
	                break;
	            }else{
	                result = new String[0];
	            }
	        }
	        result = list.toArray(new String[list.size()]);
	        return result;
	    }
}
