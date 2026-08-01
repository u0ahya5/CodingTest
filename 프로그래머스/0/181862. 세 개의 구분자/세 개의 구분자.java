import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> answer = new ArrayList<>();
        String[] arr = myStr.split("a|b|c");
        for(int i = 0; i<arr.length; i++){
            if(!arr[i].equals("")){
                answer.add(arr[i]);
            }
        }
        if(answer.size() == 0){
            return new String[]{"EMPTY"};
        }
        return answer.toArray(new String[0]);
    }
}