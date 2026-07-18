import java.util.ArrayList;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<>();
        
        for (String s : s1) {
            arr.add(s);
        }
        
        for (String s : s2) {
            if (arr.contains(s)) answer++;
        }
        
        return answer;
    }
}