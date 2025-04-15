class Solution {
    public String solution(int n) {
        String answer = "";
        
        for (int i=0; i<n; i++){ // n=5라면 0부터 4까지 반복
            if(i%2==0){ // 짝수라면 수
                answer+="수";
            } else if(i%2!=0){ // 홀수라면 박
                answer+="박";
            }
        }
        return answer;
    }
}
// 짝수 -> "수"
// 홀수 -> "박"
// n=5일 때, 수박수박수가 출력된다.