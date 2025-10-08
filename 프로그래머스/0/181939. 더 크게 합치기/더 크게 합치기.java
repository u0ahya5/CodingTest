class Solution {
    public int solution(int a, int b) {
        String answer1 = Integer.toString(a) + Integer.toString(b);
        String answer2 = Integer.toString(b) + Integer.toString(a);
        int result1 = Integer.parseInt(answer1);
        int result2 = Integer.parseInt(answer2);
        
        if(result1 > result2){
            return result1;
        } else{
            return result2;
        }
    }
}