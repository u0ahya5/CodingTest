import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String answer = "";
        char ch1[] = before.toCharArray();
        char ch2[] = after.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        if(Arrays.equals(ch1, ch2)){
            return 1;
        } else{
            return 0;
        }
    }
}