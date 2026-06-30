class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[] = s.split(" ", -1);
        for(int i = 0; i<arr.length; i++){
            if(arr[i].length() > 0){
                answer += arr[i].substring(0, 1).toUpperCase() + 
                            arr[i].substring(1).toLowerCase();
            }
            if(i != arr.length -1){
                answer += " ";
            }
        }
        
        return answer;
    }
}