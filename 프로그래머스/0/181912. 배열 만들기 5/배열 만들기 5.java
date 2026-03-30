import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s+l));
            
            if (num > k) {
                result.add(num);
            }
        }
        
        int[] answer = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            answer[j] = result.get(j);
        }
        
        return answer;
    }
}