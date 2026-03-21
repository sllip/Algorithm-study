class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int add1 = Integer.parseInt("" + a + b);
        int add2 = Integer.parseInt("" + b + a);
        
        answer = add1 >= add2 ? add1 : add2;
        
        return answer;
        
    }
}