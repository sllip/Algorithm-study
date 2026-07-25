import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int t = 0; t < commands.length; t++) {
            int[] arr = Arrays.copyOfRange(array, commands[t][0]-1, commands[t][1]);
            Arrays.sort(arr);
            answer[t] = arr[commands[t][2]-1];
        }
        
        return answer;
    }
}