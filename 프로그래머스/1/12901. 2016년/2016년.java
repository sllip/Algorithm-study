class Solution {
    public String solution(int a, int b) {
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int idx = 0;
        
        if (a%2 == 0) {
            idx = b%7 + (a/2 * 5) - 3;
            if (a == 2) idx++;
        } else {
            idx = b%7 + (a/2 * 5);
            if (a <= 7 && a != 1) idx--;
        }
        
        while (idx >= 7) idx -= 7;
        
        return days[idx]; 
    }
}