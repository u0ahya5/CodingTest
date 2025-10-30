class Solution {
    public int solution(int num, int k) {
        String answer = Integer.toString(num);
        for(int i = 0; i<answer.length(); i++){
            if(String.valueOf(answer.charAt(i)).equals(String.valueOf(k))){
                return i+1;
            }
        }
        return -1;
    }
}