class Solution {
    boolean solution(String s) {
        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'p') cnt++;
            else if (s.toLowerCase().charAt(i) == 'y') cnt--;
        }

        return cnt == 0 ? true : false;
    }
}