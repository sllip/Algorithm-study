class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        
        if (direction.equals("left")) {
            for (int i = 1; i < len; i++) {
                answer[i-1] = numbers[i];
            }
            answer[len-1] = numbers[0];
        } else {
            answer[0] = numbers[len-1];
            for (int i = 1; i < len; i++) {
                answer[i] = numbers[i-1];
            }
        }
        
        return answer;
    }
}