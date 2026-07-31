class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char upper = (char) (s.charAt(i)+n - 26*((s.charAt(i)+n)/91));
            char lower = (char) (s.charAt(i)+n - 26*((s.charAt(i)+n)/123));
            
            answer += s.charAt(i) == ' ' ? " " :
            Character.isUpperCase(s.charAt(i)) ? upper : lower;
        }
        
        return answer;
    }
}