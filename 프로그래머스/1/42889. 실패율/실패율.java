import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] fail = new double[N];
        Arrays.sort(stages);
        
        int user = stages.length;
        int p = stages[0];
        double cnt = 0;
        
        if (p > N) {
            for (int i = 0; i < N; i++) answer[i] = i+1;
            return answer;
        }
        
        for (int i = 0; i < stages.length; i++) {
            if (p == stages[i]) cnt++;
            if (p < stages[i] || i == stages.length-1) {
                if (p > N) continue;
                fail[p-1] = cnt/user;
                user = stages.length-i;
                p = stages[i];
                cnt = 1;
            }
        }
        
        for (int i = 0; i < N; i++) {
            int idx = 0;
            for (int j = 0; j < N; j++) {
                if (fail[j] > fail[idx]) idx = j;
            }
            
            answer[i] = idx+1;
            fail[idx] = -1;
        }
        
        return answer;
    }
}