class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int answer1 = 0;
        
        for(int i = 0; i<num_list.length; i++){
            answer *= num_list[i];
            answer1 += num_list[i];
        }
        if(answer < answer1 * answer1){
            return 1;
        } else{
            return 0;
        }
    }
}