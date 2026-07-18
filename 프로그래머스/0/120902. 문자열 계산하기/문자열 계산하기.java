class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replace("- ", "+ -");
        
        for (String s : str.split(" \\+ ")) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}