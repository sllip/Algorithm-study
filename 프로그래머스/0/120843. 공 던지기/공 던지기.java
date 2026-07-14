class Solution {
    public int solution(int[] numbers, int k) {
        
        switch (k*2 % numbers.length) {
            case 0:
                return numbers.length - 1;
            case 1:
                return numbers.length;
            default:
                return (k*2 % numbers.length)-1;       
        }
        
    }
}