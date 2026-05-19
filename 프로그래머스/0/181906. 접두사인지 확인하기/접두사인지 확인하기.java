class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String result = "";

        if (my_string.length() >= is_prefix.length()) {
            result = my_string.substring(0, is_prefix.length());
        }
        
        answer = is_prefix.equals(result) ? 1 : 0;
        
        return answer;
    }
}