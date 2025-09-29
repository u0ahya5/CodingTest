class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var hp1 = hp;
        
        answer = hp1/5
        hp1%=5
        
        answer += hp1/3
        hp1%=3
        
        answer += hp1/1
        return answer
    }
}