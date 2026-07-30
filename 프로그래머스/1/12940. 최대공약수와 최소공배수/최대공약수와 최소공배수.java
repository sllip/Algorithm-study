class Solution {
    public int[] solution(int n, int m) {
        int a = n*m;
        
        while (m != 0) {
            int tmp = m;
            m = n % m;
            n = tmp;
        }
        
        int[] answer = new int[]{n, a/n};
        
        return answer;
    }
}