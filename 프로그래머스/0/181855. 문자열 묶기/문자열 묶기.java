class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] str_len = new int[30];
        
        for (int i = 0; i < strArr.length; i++) {
            str_len[strArr[i].length()-1]++;
        }
        
        for (int i = 0; i < str_len.length; i++) {
            answer = Math.max(answer, str_len[i]);
        }
        
        return answer;
    }
}