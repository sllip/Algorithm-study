import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int t : topping) {
            map.put(t, map.getOrDefault(t, 0)+1);
        }
        
        for (int t : topping) {
            set.add(t);
            
            if (map.get(t) == 1) map.remove(t);
            else map.replace(t, map.get(t)-1);
            
            if (set.size() == map.size()) answer++;
        }
        
        return answer;
    }
}