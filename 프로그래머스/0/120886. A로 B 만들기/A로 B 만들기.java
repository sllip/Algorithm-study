import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String[] a = after.split("");
        String[] b = before.split("");
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) answer = 0;
        }
        
        return answer;
    }
}