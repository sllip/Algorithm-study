class Solution {
    public int solution(int n) {
        int answer = 1;
        int i = 1;
        
        while (i <= n) {
            i *= answer++;
        }
        
        return answer-2; //처음(1*1)과 마지막 ++ 제외
    }
}