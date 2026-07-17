class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int sub = 100;
        
        for (int a : array) {
            if (sub > Math.abs(a-n)) {
                sub = Math.abs(a-n);
                answer = a;
            } else if (sub == Math.abs(a-n)) {
                answer = Math.min(a, answer);
            }
        }
        
        return answer;
    }
}