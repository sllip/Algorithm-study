class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        String[] w = s.split("");
        String x = s.charAt(0)+"";
        
        for (int i = 0; i < w.length; i++) {
            if (w[i].equals(x)) count++;
            else count--;
            
            if (count == 0) {
                if (i+1 < w.length) x = w[i+1];
                answer++;
            }
        }
        
        if (count != 0) answer++;
        
        return answer;
    }
}