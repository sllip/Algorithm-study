class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int idx = num_list.length - 1;
        int last = num_list[idx];
        int prev = num_list[idx - 1];
        
        int a = (last > prev) ? (last - prev) : (last * 2);
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        answer[num_list.length] = a;
        
        return answer;
    }
}