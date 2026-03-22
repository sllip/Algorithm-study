class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int multi = 1;
        int add = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            add += num_list[i];
            multi *= num_list[i];
        }
        
        answer = multi < Math.pow(add, 2) ? 1 : 0;
        
        return answer;
    }
}