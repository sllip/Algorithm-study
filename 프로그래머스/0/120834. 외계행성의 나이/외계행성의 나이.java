class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        
        for (int i = 0; i < str.length(); i++) {
            answer += (char) (Character.getNumericValue(str.charAt(i)) + 97);
        }
        
        return answer;
    }
}