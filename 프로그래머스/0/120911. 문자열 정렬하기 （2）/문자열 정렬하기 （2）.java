import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char sort[] = answer.toCharArray();
        Arrays.sort(sort);
        
        answer = new String(sort);
        return answer;
    }
}