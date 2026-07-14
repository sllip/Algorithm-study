class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int s = 0, e = n-1;
        int num = 1;
        
        while (num <= n*n) {
            for (int j = s; j <= e; j++) {
                answer[s][j] = num++;
            }
            
            for (int i = s+1; i <= e; i++) {
                answer[i][e] = num++;
            }
            
            for (int j = e-1; j >= s; j--) {
                answer[e][j] = num++;
            }
            
            for (int i = e-1; i > s; i--) {
                answer[i][s] = num++;
            }
            
            s++; e--;
        }
        
        return answer;
    }
}