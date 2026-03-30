class Solution {
    public int solution(String number) {
        int answer = 0;
        
        int n = 0;
        for (int i = 0; i < number.length(); i++) {
            n += Character.getNumericValue(number.charAt(i));
        }
        
        answer = n % 9;
        
        return answer;
    }
}