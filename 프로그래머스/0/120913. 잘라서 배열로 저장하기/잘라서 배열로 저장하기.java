class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length() / n;
        String[] answer;
        if(my_str.length() % n != 0){
            answer = new String[size + 1];    
        } else {
            answer = new String[size];
        }
        
        int idx = 0;
        for(int i = 0; i<my_str.length(); i+=n){
            answer[idx] = my_str.substring(i, Math.min(i + n, my_str.length()));
            idx++;
        }
        return answer;
    }
}