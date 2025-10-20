class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int idx = 0;
        
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                answer[idx] = i;
                idx++;
            }
        }
        
        int result[] = new int[idx];
        for(int i = 0; i<idx; i++){
            result[i] = answer[i];
        }
        return result;
    }
}