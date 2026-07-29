import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) return new int[]{-1};
        
        int[] answer = new int[arr.length-1];
        int[] copy = Arrays.copyOf(arr, arr.length);
        
        Arrays.sort(arr);
        
        int idx = 0;
        for (int a : copy) {
            if (a != arr[0]) answer[idx++] = a;
        }
        
        return answer;
    }
}