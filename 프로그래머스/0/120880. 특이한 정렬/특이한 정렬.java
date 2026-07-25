import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        HashMap<Integer, Integer> map = new HashMap<>(numlist.length);
        
        for (int num : numlist) {
            map.put(n-num, Math.abs(n-num));
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        
        for (int num : numlist) {
            int idx = list.indexOf(map.get(n-num));
            if (answer[idx] == 0) answer[idx] = num;
            else {
                answer[idx+1] = n-num < 0 ? answer[idx] : num;
                if (answer[idx+1] != num) answer[idx] = num;
            }
        }
        
        return answer;
    }
}