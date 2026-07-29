class Solution {
    public int[] solution(int[] arr) {
        int size = 1;
        while(size < arr.length){
            size *= 2;
        }
        int[] answer = new int[size];
        if(arr.length == size){
            return arr;
        }
        for(int j = 0; j<arr.length; j++){
            answer[j] = arr[j];  
        }
        return answer;
    }
}