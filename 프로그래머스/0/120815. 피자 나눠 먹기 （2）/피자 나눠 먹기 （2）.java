class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            answer = i;
            if(i*6%n==0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}

// 12명이 피자를 시킨다면? 2판 -> 1조각
// 100명이 피자를 시킨다면? 120판 -> 