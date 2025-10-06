class Solution {
    public String solution(String rsp) {
        String answer[] = rsp.split("");
        String answer1 = "";
        for(int i = 0; i<answer.length; i++){
            if(answer[i].equals("2")){
                answer1 += "0";
            } else if(answer[i].equals("0")){
                answer1 += "5";
            } else{
                answer1 += "2";
            }
        }
        return answer1;
    }
}