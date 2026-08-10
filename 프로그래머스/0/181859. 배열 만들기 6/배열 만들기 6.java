import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            } else if(stk.get(stk.size() - 1) == arr[i]){
                stk.remove(stk.size() - 1);
                i++;
            } else{
                stk.add(arr[i]);
                i++;
            }
        }
        
        int result[] = new int[stk.size()];
        
        for(int j = 0; j<result.length; j++){
            result[j] = stk.get(j);
        }
        
        if(stk.isEmpty()){
            return new int[]{-1};
        } else{
            return result;
        }
    }
}