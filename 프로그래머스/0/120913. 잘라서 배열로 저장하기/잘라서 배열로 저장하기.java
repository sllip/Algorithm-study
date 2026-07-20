class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        String[] answer = new String[(len+n-1) / n];

        for (int i = 0; i < len; i+=n) {
            answer[i/n] = my_str.substring(i, Math.min(i+n, len));
        }

        return answer;
    }
}