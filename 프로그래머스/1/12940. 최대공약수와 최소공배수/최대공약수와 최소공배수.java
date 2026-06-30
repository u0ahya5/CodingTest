class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int GCD = 0;
        int LCM = 0;
        for(int i = 1; i<=m; i++){
            if(n % i == 0 && m % i == 0){
                if(GCD <= i){
                    GCD = i;
                }
            }
        }
        
        LCM = n*m / GCD;
        
        answer[0] = GCD;
        answer[1] = LCM;
        
        return answer;
    }
}