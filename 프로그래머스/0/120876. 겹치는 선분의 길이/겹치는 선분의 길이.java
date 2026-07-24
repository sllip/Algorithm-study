class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] guide = new int[200];
        
        for (int i = 0; i < 3; i++) {
            for (int j = lines[i][0]+100; j < lines[i][1]+100; j++) {
                guide[j]++;
                if (guide[j] == 2) answer++;
            }
        }
        
        return answer;
    }
}