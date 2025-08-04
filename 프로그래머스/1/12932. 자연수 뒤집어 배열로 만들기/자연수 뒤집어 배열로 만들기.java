class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        int a = 0;
        
        while (n > 0){
            answer[a++] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}