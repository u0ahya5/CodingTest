class Solution {
    fun solution(strlist: Array<String>): IntArray {
        val answer = arrayListOf<Int>()
        for (i in strlist) {
            answer.add(i.length)
        }
        return answer.toIntArray()
    }
}