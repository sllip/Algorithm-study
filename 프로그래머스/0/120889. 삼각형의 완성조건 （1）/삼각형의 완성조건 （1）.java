class Solution {
    public int solution(int[] sides) {
        int answer = sides[0] + sides[1] + sides[2];
        int max = sides[0];
        
        for (int s : sides) {
            max = Math.max(s, max);
        }
        
        answer = answer <= max*2 ? 2 : 1;
        
        return answer;
    }
}