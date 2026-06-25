class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int denom = denom1 * denom2;
        int numer = (numer1 * denom2) + (numer2 * denom1);
        
        int denom3 = denom;
        int numer3 = numer;
        
        //유클리드 호제법을 이용하여 최대공약수 구하기
        while (numer != 0) {
            int tmp = numer;
            numer = denom % numer;
            denom = tmp;
        }
        
        int max = denom;
        
        answer[0] = numer3 / max;
        answer[1] = denom3 / max;
        
        return answer;
    }
}