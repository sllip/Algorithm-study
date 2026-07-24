import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        
        int[] answer = new int[len];
        int[] avg = new int[len];
        
        for (int i = 0; i < len; i++) {
            avg[i] = score[i][0]+score[i][1];
        }
        
        Arrays.fill(answer, 1);
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j && avg[i] > avg[j]) answer[j]++;
            }
        }
        
        return answer;
    }
}