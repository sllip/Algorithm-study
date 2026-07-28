class Solution {
    public boolean solution(int x) {
        int y = x;
        int n = 0;
        
        while (x != 0) {
            n += x % 10;
            x /= 10;
        }
        
        return y%n == 0 ? true : false;
    }
}