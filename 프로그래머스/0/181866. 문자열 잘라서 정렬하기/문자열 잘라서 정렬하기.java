import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        
        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i].equals("")) {
                idx++;
            }
        }
        
        answer = Arrays.copyOfRange(answer, idx, answer.length);
        
        return answer;
    }
}