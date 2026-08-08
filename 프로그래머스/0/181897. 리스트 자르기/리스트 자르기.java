import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if(n == 1){
            for(int i = 0; i<=b; i++){
                answer.add(num_list[i]);
            }
        } else if(n == 2){
            for(int i = a; i<num_list.length; i++){
                answer.add(num_list[i]);
            }
        } else if(n == 3){
            for(int i = a; i<=b; i++){
                answer.add(num_list[i]);
            }
        } else if(n == 4){
            for(int i = a; i<=b; i+=c){
                answer.add(num_list[i]);
            }
        }
        int result[] = new int[answer.size()];
        
        for(int i = 0; i<result.length; i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}