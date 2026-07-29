class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        String str = s.replaceAll("[a-zA-Z]", "a");
        
        if ((s.length() == 4 || s.length() == 6) && !str.contains("a")) answer = true;
        
        return answer;
    }
}