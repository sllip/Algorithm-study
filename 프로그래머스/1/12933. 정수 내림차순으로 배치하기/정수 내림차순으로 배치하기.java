import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        
        String[] str = String.valueOf(n).split("");
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str));
        
        arr.sort(Comparator.reverseOrder());
        
        for (String s : arr) {
            answer += s;
        }
        
        return Long.parseLong(answer);
    }
}