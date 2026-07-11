import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        HashMap<Integer, Integer> map = new HashMap<>(len);
        
        for (int i = 0; i < len; i++) {
            map.put(emergency[i], i);
        }
        
        Arrays.sort(emergency);
        
        int idx = 1;
        for (int i = len-1; i >= 0; i--) {
            answer[map.get(emergency[i])] = idx;
            idx++;
        }
        
        return answer;
    }
}