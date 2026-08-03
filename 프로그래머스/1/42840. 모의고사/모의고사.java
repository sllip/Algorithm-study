import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] r = new int[3];
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < answers.length; i++) {
            if (p1[i%5] == answers[i]) r[0]++;
            if (p2[i%8] == answers[i]) r[1]++;
            if (p3[i%10] == answers[i]) r[2]++;
        }
        
        int max = Math.max(r[2], Math.max(r[0], r[1]));
        for (int i = 0; i < 3; i++) {
            if (r[i] >= max) list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}