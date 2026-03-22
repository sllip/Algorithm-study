class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int multi = 1;
        int sum = 0;
        
        for (int i : num_list) {
            sum += i;
            multi *= i;
        }
        
        answer = multi < Math.pow(sum, 2) ? 1 : 0;
        
        return answer;
    }
}