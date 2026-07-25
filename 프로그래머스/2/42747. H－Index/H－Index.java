class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int h = 1;
        
        while (h <= citations.length) {
            int more = 0;
            for (int c : citations) {
                if (c >= h) more++;
                if (more >= h && citations.length-more <= h) answer = h;
            }
            h++;
        }
        
        return answer;
    }
}