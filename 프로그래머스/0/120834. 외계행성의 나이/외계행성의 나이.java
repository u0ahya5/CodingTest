class Solution {
    public String solution(int age) {
    String answer = "";
    char str[] = {'a','b','c','d','e','f','g','h','i','j'};
    String alien = String.valueOf(age);
    
    for(int i = 0; i<alien.length(); i++){
        int digit = alien.charAt(i)-'0';
            answer += str[digit]; 
        }
        return answer;
    }
}