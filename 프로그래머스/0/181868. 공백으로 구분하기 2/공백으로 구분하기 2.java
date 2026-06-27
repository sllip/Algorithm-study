import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        while (my_string.contains("  ")) {
            my_string = my_string.replace("  ", " ");
        }
        
        if (my_string.startsWith(" ")) {
            my_string = my_string.substring(1, my_string.length());
        }
        
        String[] answer = my_string.split(" ");
        
        return answer;
    }
}