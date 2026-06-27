class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] result = myString.toLowerCase().split("");
        
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals("a")) {
                result[i] = result[i].toUpperCase();
            }
            answer += result[i];
        }
        
        return answer;
    }
}