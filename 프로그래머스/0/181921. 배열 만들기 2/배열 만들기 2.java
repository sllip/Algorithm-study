import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String num = Integer.toString(i);
            boolean flag = true;
            
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) != '0' && num.charAt(j) != '5') {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                result.add(i);
            }
        }
        
        if (result.size() == 0) {
            result.add(-1);
        }
        
        int[] answer = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            answer[k] = result.get(k);
        }
        
        return answer;
    }
}