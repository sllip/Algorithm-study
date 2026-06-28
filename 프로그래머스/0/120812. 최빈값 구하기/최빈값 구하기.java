import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] num_cnt = new int[array.length];
        Arrays.sort(array);
        
        int idx = 0, n = 1;
        int max_num = 0, max_cnt = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] == array[i]) {
                n++;
            } else {
                num_cnt[idx++] = n;
                if (n > max_cnt) {
                    max_cnt = n;
                    max_num = array[i-1];
                }
                n = 1;
            }
            
            if (i == array.length - 1) {
                num_cnt[idx] = n;
                if (n > max_cnt) {
                    max_cnt = n;
                    max_num = array[i-1];
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < num_cnt.length; i++) {
            if (num_cnt[i] == max_cnt) {
                count++;
            }
        }
        
        answer = count > 1 ? -1 : max_num;
        
        if (num_cnt.length == 1) {
            answer = array[0];
        }
        
        return answer;
    }
}