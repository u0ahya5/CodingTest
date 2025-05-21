class Solution {
    public int[] solution(int start_num, int end_num) {
        int a = start_num-end_num+1;
        int[] answer = new int[a];
        int index = 0;
        for(int i = start_num; i>=end_num; i--){
             answer[index++] = i;
        }
        return answer;
    }
}
// 음,,, 스타트 넘부터 엔드 넘까지,,, 그 사이에 있는 값들을 감소하면서 더해두기