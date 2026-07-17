class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.replace(" Z", "Z").split(" ");
        
        for (String a : arr) {
            if (a.endsWith("Z")) continue;
            else answer += Integer.parseInt(a);
        }
        
        return answer;
    }
}