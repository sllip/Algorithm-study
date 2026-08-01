import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int min = score[0];
        
        for (int i = 0; i < Math.min(k, score.length); i++) {
            min = Math.min(min, score[i]);
            answer[i] = min;
        }
        
        int[] topK = Arrays.copyOfRange(score, 0, k);
        Arrays.sort(topK);
        
        for (int i = k; i < score.length; i++) {
            if (score[i] > topK[0]) {
                topK[0] = score[i];
                Arrays.sort(topK);
            }
            answer[i] = topK[0];
        }
        
        return answer;
    }
}