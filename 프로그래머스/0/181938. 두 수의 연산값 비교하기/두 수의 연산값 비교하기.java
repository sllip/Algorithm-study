class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int add = Integer.parseInt("" + a + b);
        int multi = 2 * a * b;
        
        answer = add >= multi ? add : multi;
        
        return answer;
    }
}