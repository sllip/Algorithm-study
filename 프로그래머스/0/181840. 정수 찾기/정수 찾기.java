class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        
        for (int m : num_list) {
            if (m == n) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}