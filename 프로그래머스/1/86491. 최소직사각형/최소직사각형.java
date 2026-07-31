class Solution {
    public int solution(int[][] sizes) {
        int w = 0, h = 0;
        
        for (int i[] : sizes) {
            w = Math.max(w, Math.max(i[0], i[1]));
            h = Math.max(h, Math.min(i[0], i[1]));
        }
        
        return w*h;
    }
}