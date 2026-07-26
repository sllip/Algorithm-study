class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int denom = b;
        
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
            
        for (int i = 3; i <= (denom/a); i++) {
            if ((denom/a) % i == 0 && i%5 != 0 && i%2 != 0) {
                answer = 2;
                break;
            }
        }
        
        return answer;
    }
}