class Solution {
    public int[] solution(int[] num_list, int n) {
        int index = n-1;
        int[] answer = new int[num_list.length - index];
        for(int i = index; i<num_list.length; i++){
            answer[i-index] = num_list[i];
        }
        return answer;
    }
}