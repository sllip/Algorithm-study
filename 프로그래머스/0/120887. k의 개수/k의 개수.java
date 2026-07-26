class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        
        for (int n = i; n <= j; n++) {
            str += String.valueOf(n);
        }
        
        for (int n = 0; n < str.length(); n++) {
            if (str.charAt(n)-'0' == k) answer++;
        }
        
        return answer;
    }
}