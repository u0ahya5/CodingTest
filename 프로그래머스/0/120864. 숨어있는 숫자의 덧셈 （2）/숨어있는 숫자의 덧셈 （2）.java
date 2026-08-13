class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "";
        for(int i = 0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){
                num += my_string.charAt(i);
            } else{
                if(!num.equals("")){
                    answer += Integer.valueOf(num);
                    num = "";
                }
            }
        }
        
        if(!num.equals("")){
            answer += Integer.valueOf(num);
            num = "";
        }
        return answer;
    }
}