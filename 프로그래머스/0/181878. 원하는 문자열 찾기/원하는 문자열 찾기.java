class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        
        for (int i = 0; i+pat.length()-1 < myString.length(); i++) {
            str = (myString.substring(i, i + pat.length())).toLowerCase();
            if (str.equals(pat.toLowerCase())) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}