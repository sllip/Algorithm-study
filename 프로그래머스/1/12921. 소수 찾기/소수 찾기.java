class Solution {
    public int solution(int n) {
        int answer = -2; // 1과 cnt의 0번 인덱스 빼주기
        int[] cnt = new int[n+1];
        
        for (int i = 2; i <= (n+1)/2; i++) {
            for (int j = 2; j <= n/i; j++) {
                cnt[i*j]++;
            }
        }
        
        for (int c : cnt) {
            if (c == 0) answer++;
        }
        
        return answer;
    }
}