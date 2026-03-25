class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int n = 0; n < queries.length; n++) {
            int s = queries[n][0];
            int e = queries[n][1];
            int k = queries[n][2];
            
            int min = -1;
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && (min == -1 || arr[i] < min)) {
                    min = arr[i];
                }
            }
            
            answer[n] = min;
        }
        
        return answer;
    }
}