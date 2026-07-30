class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] my_char = my_string.toCharArray();
        int left = s;
        int right = e;
        while (left < right) {
            char temp = my_char[left];
            my_char[left] = my_char[right];
            my_char[right] = temp;

            left++;
            right--;
        }
        answer = String.valueOf(my_char);
        return answer;
    }
}