import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr[0]));
        
        for (int a : arr) {
            if (list.lastIndexOf(a) != list.size()-1) list.add(a);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}