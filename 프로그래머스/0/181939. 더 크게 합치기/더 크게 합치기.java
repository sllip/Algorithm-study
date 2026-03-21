class Solution {
    public int solution(int a, int b) {
        
        String add1 = String.valueOf(a) + String.valueOf(b);
        String add2 = String.valueOf(b) + String.valueOf(a);
        
        int result1 = Integer.parseInt(add1);
        int result2 = Integer.parseInt(add2);
        
        return result1 >= result2 ? result1 : result2;
        
    }
}