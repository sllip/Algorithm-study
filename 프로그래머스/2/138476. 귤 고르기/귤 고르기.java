import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>(tangerine.length);
        
        for (int t : tangerine) {
            if (map.containsKey(t)) {
                map.replace(t, map.get(t)+1);
            } else {
                map.put(t, 1);
            }
        }
        
        int[] arr = new int[map.size()];
        
        int idx = 0;
        for (int n : map.values()) {
            arr[idx] = n;
            idx++;
        }
        
        Arrays.sort(arr);
        
        for (int i = arr.length-1; i >= 0; i--) {
            k -= arr[i];
            answer++;
            if (k <= 0) break;
        }
        
        return answer;
    }
}