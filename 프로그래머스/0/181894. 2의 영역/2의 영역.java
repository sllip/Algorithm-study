import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        int start = -1;
        int end = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }    
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                end = i;
            }
        }
        
        if (start == -1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = Arrays.copyOfRange(arr, start, end+1);
        }
        
        return answer;
    }
}