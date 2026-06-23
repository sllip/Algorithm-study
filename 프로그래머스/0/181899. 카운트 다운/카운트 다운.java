class Solution {
    public int[] solution(int start_num, int end_num) {
        int n = start_num - end_num + 1;
        
        int[] answer = new int[n];
        
        for (int j = 0; j < n; j++) {
            answer[j] = start_num;
            start_num--;
        }
        
        return answer;
    }
}