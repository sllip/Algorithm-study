class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int n = num%2 == 0 ? total/num + 1 : total/num;
        
        for (int i = 0; i < num; i++) {
            answer[i] = (n-num/2)+i;
        }
        
        return answer;
    }
}