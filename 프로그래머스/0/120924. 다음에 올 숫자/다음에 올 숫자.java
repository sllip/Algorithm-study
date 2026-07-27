class Solution {
    public int solution(int[] common) {
        
        int a = common[common.length-1];
        int b = common[common.length-2];
        int c = common[common.length-3];
        
        return (a+c)/2.0 == (double) b ? a+(a-b) : a*(a/b);
    }
}