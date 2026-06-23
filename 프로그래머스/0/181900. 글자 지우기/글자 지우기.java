import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        int j = 0;
        Arrays.sort(indices);
        
        for (int i = 0; i < my_string.length(); i++) {
            if (i == indices[j]) {
                if ((j+1) != indices.length) {
                    j++;
                }
                continue;
            } else {
                answer += String.valueOf(my_string.charAt(i));
            }
        }
        
        return answer;
    }
}