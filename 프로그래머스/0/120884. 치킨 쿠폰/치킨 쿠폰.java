class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken % 10;
        
        while (chicken >= 10) {
            chicken = chicken / 10;
            coupon += chicken % 10;
            answer += chicken;
        }
        
        answer += (coupon + coupon/10) / 10;
        
        return answer;
    }
}