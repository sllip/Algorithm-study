import java.util.ArrayList;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String nums = dartResult.replaceAll("[#*]", "");
        int[] score = new int[nums.length()/2];
        
        int idx = 0;
        for (String s : nums.split("[SDT]")) {
            score[idx++] = Integer.parseInt(s);
        }
        
        idx = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if (c == 'S') idx++;
            else if (c == 'D') score[idx] = score[idx]*score[idx++];
            else if (c == 'T') score[idx] = score[idx]*score[idx]*score[idx++];
            else if (c == '#') score[idx-1] = -score[idx-1];
            else if (c == '*') {
                score[idx-1] *= 2;
                if (idx > 1) score[idx-2] *= 2;
            }
        }
        
        for (int n : score) answer += n;
        
        return answer;
    }
}