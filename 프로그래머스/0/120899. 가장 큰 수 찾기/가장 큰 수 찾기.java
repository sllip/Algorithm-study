import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>(array.length);
        
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        
        Arrays.sort(array);
        
        int max = array[array.length-1];
        int[] answer = new int[]{max, map.get(max)};
        
        return answer;
    }
}