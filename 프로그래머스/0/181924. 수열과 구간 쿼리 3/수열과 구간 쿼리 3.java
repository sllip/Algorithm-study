class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < queries.length; i++) {
            int query1 = arr[queries[i][0]];
            int query2 = arr[queries[i][1]];
            
            arr[queries[i][0]] = query2;
            arr[queries[i][1]] = query1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}