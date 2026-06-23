class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (int i = 0; i < 26; i++) {
            answer[i] = 65+i;
        }
        
        for (int i = 26; i < answer.length; i++) {
            answer[i] = 71+i;
        }
        
        for (int i = 0; i < 52; i++) {
            int count = 0;
            for (int j = 0; j < my_string.length(); j++) {
                if ((int)my_string.charAt(j) == answer[i]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}