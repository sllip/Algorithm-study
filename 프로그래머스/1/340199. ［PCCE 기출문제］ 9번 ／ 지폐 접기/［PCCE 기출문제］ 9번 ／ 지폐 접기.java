import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        Arrays.sort(wallet);
        int max = Math.max(bill[0], bill[1]);
        int min = Math.min(bill[0], bill[1]);
        
        while (min > wallet[0] || max > wallet[1]) {
            if (bill[0] > bill[1]) bill[0] /= 2;
            else bill[1] /= 2;
            
            max = Math.max(bill[0], bill[1]);
            min = Math.min(bill[0], bill[1]);
            
            answer++;
        }
        
        return answer;
    }
}