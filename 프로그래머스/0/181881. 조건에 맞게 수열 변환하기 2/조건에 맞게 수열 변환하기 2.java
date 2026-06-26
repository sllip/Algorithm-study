import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr_x = new int[arr.length];
        
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] >= 50) && (arr[i] % 2 == 0)) {
                    arr_x[i] = arr[i] / 2;
                } else if ((arr[i] < 50) && (arr[i] % 2 != 0)) {
                    arr_x[i] = arr[i] * 2 + 1;
                } else {
                    arr_x[i] = arr[i];
                }
            }
            
            if (Arrays.equals(arr, arr_x)) {
                break;
            }
            
            arr = Arrays.copyOf(arr_x, arr_x.length);
            answer++;
        }
        
        return answer;
    }
}