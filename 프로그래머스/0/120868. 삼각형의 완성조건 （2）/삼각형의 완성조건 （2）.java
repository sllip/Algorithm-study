class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = Math.min(sides[0], sides[1]);
        int b = Math.max(sides[0], sides[1]);
        
        for (int i = b-a+1; i <= b; i++) {
            answer++;
        }
        
        for (int i = b+1; i < a+b; i++) {
            answer++;
        }
        
        return answer;
    }
}