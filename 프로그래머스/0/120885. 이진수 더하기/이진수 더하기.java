class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int carry = 0;
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        while(i >= 0 || j >= 0 || carry > 0){
            int n = 0;
            int m = 0;
            
            if(i >= 0){
                n = bin1.charAt(i) - '0';
            }
            
            if(j >= 0){
                m = bin2.charAt(j) - '0';
            }
            
            int sum = n + m + carry;
            
            answer += sum % 2;
            carry = sum / 2;
            
            i--;
            j--;
        }
        return new StringBuilder(answer).reverse().toString();
    }
}