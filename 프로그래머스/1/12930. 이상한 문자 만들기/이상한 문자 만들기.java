class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        int idx = 0;
        
        while (answer.length() != len) {
            String str = String.valueOf(s.charAt(idx));
            
            if (idx%2 == 0) answer += str.toUpperCase();
            else answer += str.toLowerCase();
            
            if (s.charAt(idx) == ' ') {
                s = s.substring(idx+1, s.length());
                idx = -1;
            }
            
            idx++;
        }
        
        return answer;
    }
}