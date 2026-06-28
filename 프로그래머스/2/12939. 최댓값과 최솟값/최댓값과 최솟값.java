class Solution {
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String arr[] = s.split(" ");
        for(int i = 0; i<arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        answer = min + " " + max;
        return answer;
    }
}