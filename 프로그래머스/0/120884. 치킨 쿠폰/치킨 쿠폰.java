class Solution {
    public int solution(int chicken) {
        int service = 0;
        int coupon = chicken;
        
        while(coupon>=10){
            int schicken = coupon/10;
            service += schicken;
            coupon = (coupon%10) + schicken;
        }
        return service;
    }
}
// 한 마리당 한 쿠폰
// 10장(10마리) 모으면? 한마리 서비스
// 100마리를 시키면 쿠폰은 100개 10마리 먹을 수 있음
// 서비스로 10개 더 발급 됐으니깐 1마리 더 해서 11마리