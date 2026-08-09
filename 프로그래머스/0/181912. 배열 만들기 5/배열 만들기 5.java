import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<intStrs.length; i++){
            String str = intStrs[i].substring(s, s+l);
            int num = Integer.parseInt(str);
            
            if(k < num){
                answer.add(num);
            }
        }
        int[] result = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}