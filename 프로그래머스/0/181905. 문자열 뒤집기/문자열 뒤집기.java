class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String first = my_string.substring(0, s);
        
        String middle = my_string.substring(s, e+1);
        
        String reverse = "";
        for (int i = middle.length()-1; i >= 0; i--) {
            reverse += String.valueOf(middle.charAt(i));
        }
        
        String last = my_string.substring(e+1, my_string.length());
        
        answer = first + reverse + last;
        
        return answer;
    }
}