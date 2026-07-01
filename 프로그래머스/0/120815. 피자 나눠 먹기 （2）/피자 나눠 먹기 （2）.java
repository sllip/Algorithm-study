class Solution {
    public int solution(int n) {
        int answer = 0;
        int m = n;
        int p = 6;
        
        while (n != 0) {
            int tmp = n;
            n = p % n;
            p = tmp;
        }
        
        answer = ((m * 6) / p) / 6;
        
        return answer;
    }
}