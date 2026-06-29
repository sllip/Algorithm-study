import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {  
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (Math.pow(2, i) >= arr.length) {
                break;
            }
        }
        
        int[] answer = new int[(int) Math.pow(2, i)];
        
        for (int j = 0; j < arr.length; j++) {
            answer[j] = arr[j];
        }
        
        return answer;
    }
}