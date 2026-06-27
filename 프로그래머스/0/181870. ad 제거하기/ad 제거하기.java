import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        int idx = 0, count = 0;
        for (String s : strArr) {
            if (!s.contains("ad")) {
                answer[idx++] = s;
                count++;
            }
        }
        
        answer = Arrays.copyOf(answer, count);
        
        return answer;
    }
}