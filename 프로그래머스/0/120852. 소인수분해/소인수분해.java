import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 2;
        
        while (i <= n) {
            if (n%i == 0) {
                n = n/i;
                if (!arr.contains(i)) {
                    arr.add(i);
                }
            } else {
                i++;
            }
        }
        
        int[] answer = new int[arr.size()];

        for (int j = 0; j < arr.size(); j++) {
            answer[j] = arr.get(j);
        }
        
        return answer;
    }
}