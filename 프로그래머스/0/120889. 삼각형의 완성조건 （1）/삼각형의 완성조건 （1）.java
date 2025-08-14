class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i<sides.length; i++) {
            sum += sides[i];
            if (sides[i] > max) {
                max = sides[i];
            }
        }
        if(max < sum-max){
            return 1;
        } else {
            return 2;
        }
    }
}