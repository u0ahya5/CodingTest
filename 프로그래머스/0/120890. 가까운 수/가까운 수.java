import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        for(int i = 1; i<array.length; i++){
            int cur = Math.abs(answer - n);
            int next = Math.abs(array[i] - n);
            
            if(cur > next){
                answer = array[i];
            } else if(cur == next && array[i] < answer){
                answer = array[i];
            }
        }
        return answer;
    }
}