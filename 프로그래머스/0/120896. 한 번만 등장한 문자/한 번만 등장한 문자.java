class Solution {
    public String solution(String s) {
        String answer = "";
        int[] count = new int[26];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }
        for(int i = 0; i<count.length; i++){
            if(count[i] == 1){
                answer += (char)('a' + i);
            }
        }
        return answer;
    }
}