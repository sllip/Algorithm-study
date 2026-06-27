import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        int idx = 0, count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answer[idx++] = strArr[i];
                count++;
            }
        }
        
        answer = Arrays.copyOf(answer, count);
        
        return answer;
    }
}