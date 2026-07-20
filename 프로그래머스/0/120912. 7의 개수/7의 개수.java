class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int idx = 0;
        
        while (idx != array.length) {
            if (array[idx] % 10 == 7) answer++;
            array[idx] /= 10;
            
            if (array[idx] == 0) idx++;
        }
        
        return answer;
    }
}