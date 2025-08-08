class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0]*numbers[1];
        
        for(int i = 0; i<numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                int answer = numbers[i]*numbers[j];
                if (answer > max) {
                    max = answer;
                }
            }
        }
        return max;
    }
}