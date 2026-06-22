class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        int row = my_string.length() / m;
        char[][] arr = new char[row][m];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = my_string.charAt((i*m)+j);
            }
        }
        
        for (int k = 0; k < row; k++) {
            answer += String.valueOf(arr[k][c-1]);
        }
        
        return answer;
    }
}