class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int idx = num_list.length;
        int last = num_list[idx-1];
        int prev = num_list[idx-2];
        
        int a = (last > prev) ? (last - prev) : (last * 2);
        
        for (int i = 0; i < idx; i++) {
            answer[i] = num_list[i];
        }
        
        answer[idx] = a;
        
        return answer;
    }
}