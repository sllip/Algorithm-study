class Solution {
    public int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        
        for (int i = 1; i < dots.length; i++) {
            if (dots[i][1] == dots[0][1]) {
                x = Math.abs(dots[0][0]-dots[i][0]);
            }
            
            if (dots[i][0] == dots[0][0]) {
                y = Math.abs(dots[0][1]-dots[i][1]);
            }
        }
        
        return x*y;
    }
}