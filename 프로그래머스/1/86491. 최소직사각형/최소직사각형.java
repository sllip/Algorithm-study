class Solution {
    public int solution(int[][] sizes) {
        int w = 0, h = 0;
        
        for (int i[] : sizes) {
            int tmp = i[0];
            i[0] = Math.max(i[0], i[1]);
            i[1] = Math.min(tmp, i[1]);
            
            w = Math.max(w, i[0]);
            h = Math.max(h, i[1]);
        }
        
        return w*h;
    }
}