import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            
            for (int j = 0; j < k; j++) {
                if (answer[j] == arr[i]) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                answer[idx++] = arr[i];
            }
            
            if (idx == k) {
                break;
            }
        }
        
        return answer;
    }
}