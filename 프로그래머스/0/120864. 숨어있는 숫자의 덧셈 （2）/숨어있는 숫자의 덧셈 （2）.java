class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[a-zA-z]", " ");
        
        for (String s : str.split(" ")) {
            if (!s.equals("")) answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}