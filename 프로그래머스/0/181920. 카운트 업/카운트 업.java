import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = start_num; i <= end_num; i++) {
            result.add(i);
        }
        
        for (int j = 0; j < answer.length; j++) {
            answer[j] = result.get(j);
        }
        
        return answer;
    }
}