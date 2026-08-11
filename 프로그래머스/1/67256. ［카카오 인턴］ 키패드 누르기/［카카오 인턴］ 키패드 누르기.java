class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l = 10, r = 10;
        
        for (int n : numbers) {
            if (n == 0) n = 11;
            if (n%3 == 1) {
                answer += "L";
                l = n+2;
            } else if (n%3 == 0) {
                answer += "R";
                r = n;
            } else {
                int dl = Math.abs(l-n);
                int dr = Math.abs(r-n);
                
                if (dl%3 == 0) dl /= 3;
                else if (dl > 2) dl = (dl == 5) ? 3 : dl/2;
                
                if (dr%3 == 0) dr /= 3;
                else if (dr > 2) dr = (dr == 5) ? 3 : dr/2;
                
                if (dl < dr || (dl == dr && hand.equals("left"))) {
                    answer += "L";
                    l = n;
                } else {
                    answer += "R";
                    r = n;
                }
            }
        }
        
        return answer;
    }
}