import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stk.size() == 0 || stk.get(stk.size()-1) != arr[i]) {
                stk.add(arr[i]);
            } else {
                stk.remove(stk.size()-1);
            }
        }
        
        if (stk.size() == 0) {
            stk.add(-1);
        }
        
        int[] answer = new int[stk.size()];
        
        for (int i = 0; i < stk.size(); i++) {
            answer[i] = stk.get(i);
        }
        
        return answer;
    }
}