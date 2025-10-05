class Solution {
    public int solution(int a, int b) {
        String answer = Integer.toString(a) + Integer.toString(b);
        int answer1 = Integer.parseInt(answer);
        if(answer1 > 2*a*b){
            return answer1;
        } else{
            return 2*a*b;
        }
    }
}