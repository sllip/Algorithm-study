class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        
        for (int i = 0; i < myString.length(); i++) {
            str += myString.charAt(i) == 65 ? "B" : "A";
        }
        
        answer = str.contains(pat) ? 1 : 0;
        
        return answer;
    }
}