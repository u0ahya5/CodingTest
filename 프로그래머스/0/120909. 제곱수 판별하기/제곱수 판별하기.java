class Solution {
    public int solution(int n) {
        int square = (int) Math.sqrt(n);
        if(square*square==n){
            return 1;
        } else {
            return 2;
        }
    }
}