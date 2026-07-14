import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] clone = emergency.clone();
        Arrays.sort(emergency);
        for(int i = 0; i<clone.length; i++){
            for(int j = 0; j<emergency.length; j++){
                if(clone[i] == emergency[j]){
                    answer[i] = emergency.length - j;   
                }
            }
        }
        return answer;
    }
}