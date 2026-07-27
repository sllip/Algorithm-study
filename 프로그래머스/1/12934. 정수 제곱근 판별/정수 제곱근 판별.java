class Solution {
    public long solution(long n) {
        double x = Math.sqrt((double) n);
        return x%1 == 0.0 ? (long) ((x+1)*(x+1)) : -1;
    }
}