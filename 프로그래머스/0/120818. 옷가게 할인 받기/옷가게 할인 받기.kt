class Solution {
    fun solution(price: Int): Int {
        if (price>=500000){
            return (price*0.8).toInt();
        } else if(price>=300000){
            return (price*0.9).toInt();
        } else if (price>=100000){
            return (price*0.95).toInt();
        } else return price;
    }
}