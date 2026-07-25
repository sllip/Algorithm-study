import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : numlist) {
            list.add(Math.abs(n-num));
        }
        
        Collections.sort(list);
        
        for (int num : numlist) {
            int idx = list.indexOf(Math.abs(n-num));
            if (answer[idx] == 0) answer[idx] = num;
            else {
                answer[idx+1] = n-num < 0 ? answer[idx] : num;
                if (answer[idx+1] != num) answer[idx] = num;
            }
        }
        
        return answer;
    }
}