class Solution {
    public int solution(int n) {
        int sum = 0;
        int answer = 0;
        for(int i = 0; i<=n; i++){
            if(i%2==0){
                sum+=answer+i;
            }
        }
        return sum;
    }
}