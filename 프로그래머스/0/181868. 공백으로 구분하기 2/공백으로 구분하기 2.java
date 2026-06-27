import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        String[] str = my_string.split(" ");
        
        int idx = 0, count = 0;
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                answer[idx++] = str[i];
                count++;
            }
        }
        
        answer = Arrays.copyOf(answer, count);
        
        return answer;
    }
}