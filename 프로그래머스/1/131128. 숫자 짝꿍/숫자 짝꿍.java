class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] X_num = new int[10];
        int[] Y_num = new int[10];
        
        for (int i = 0; i < X.length(); i++) {
            X_num[X.charAt(i)-'0']++;
        }
        
        for (int i = 0; i < Y.length(); i++) {
            Y_num[Y.charAt(i)-'0']++;
        }
        
        for (int i = 9; i >= 0; i--) {
            int n = Math.min(X_num[i], Y_num[i]);
            if (n > 0) answer += (i+"").repeat(n);
        }
        
        if (answer.startsWith("0")) answer = "0";
        else if (answer.equals("")) answer = "-1";
        
        return answer;
    }
}