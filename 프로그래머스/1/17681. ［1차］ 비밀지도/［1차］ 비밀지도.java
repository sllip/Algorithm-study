class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for (int i = 0; i < arr1.length; i++) {
            int[] bin = new int[n];
            int idx = n-1;
            
            while (idx >= 0) {
                bin[idx--] = arr1[i]%2 + arr2[i]%2;
                arr1[i] /= 2;
                arr2[i] /= 2;
            }
            
            answer[i] = "";
            for (int b : bin) {
                answer[i] += b == 0 ? " " : "#";
            }
        }
        
        return answer;
    }
}