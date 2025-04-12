class Solution {
    public int solution(int n) {
        int answer = 0;
        // 피자 판 개수 i
        for(int i=1; i<=n; i++){
            answer = i;
            // i판 시켰을 때 조각 수가 n명에게 나누어 떨어진다면
            if(i*6%n==0){
                answer=i;
                break;
            }
        }
        return answer;
    }
}

// 12명이 피자를 시킨다면? 2판 -> 1조각
// 100명이 피자를 시킨다면? 50판 -> 3조각