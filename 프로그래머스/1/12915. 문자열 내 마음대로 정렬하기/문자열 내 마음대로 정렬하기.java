import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].charAt(n)+"";
        }
        
        Arrays.sort(answer);
        Arrays.sort(strings);
        
        for (String s : strings) {
            for (int i = 0; i < strings.length; i++) {
                if (answer[i].equals(s.charAt(n)+"")) {
                    answer[i] = s;
                    break;
                }
            }
        }
        
        return answer;
    }
}