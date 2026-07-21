class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] bomb = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bomb[i][j] = board[i][j];
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (bomb[i][j] == 1) {
                    if (i-1 >= 0 && j-1 >= 0) board[i-1][j-1] = 1;
                    if (i-1 >= 0) board[i-1][j] = 1;
                    if (i-1 >= 0 && j+1 < n) board[i-1][j+1] = 1;
                    
                    if (j-1 >= 0) board[i][j-1] = 1;
                    if (j+1 < n) board[i][j+1] = 1;
                        
                    if (i+1 < n && j-1 >= 0) board[i+1][j-1] = 1;
                    if (i+1 < n) board[i+1][j] = 1;
                    if (i+1 < n && j+1 < n) board[i+1][j+1] = 1;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}