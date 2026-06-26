class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int idx = 0;
        
        while (idx < num_list.length) {
            if (num_list[idx] == 1) {
                idx++;
            } else if (num_list[idx] % 2 == 0) {
                num_list[idx] = num_list[idx] / 2;
                answer++;
            } else {
                num_list[idx] = (num_list[idx] - 1) / 2;
                answer++;
            }
        }
        
        return answer;
    }
}