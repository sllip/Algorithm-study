import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        
        result.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            
            result.add(n);
        }
        
        int[] answer = new int [result.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = result.get(j);
        }
        
        return answer;
    }
}