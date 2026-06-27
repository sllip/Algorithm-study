class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int i = myString.indexOf(pat);
        int idx = 0;
        
        while (true) {
            i = myString.indexOf(pat, idx+1);
            if (i == -1) {
                break;
            }
            
            idx = i;
        }
        
        answer = myString.substring(0, idx + pat.length());
        
        return answer;
    }
}