class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        int a_len = a.length();
        int b_len = b.length();
        int[] result = new int[Math.max(a_len, b_len)];
        
        String[] arr1 = a.split("");
        String[] arr2 = b.split("");
        
        int j = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = Integer.parseInt(arr1[a_len-j]);
            j++;
            if (a_len-j < 0) {
                break;
            }
        }
        
        int k = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] += Integer.parseInt(arr2[b_len-k]);
            k++;
            if (b_len-k < 0) {
                break;
            }
        }
        
        for (int i = result.length - 1; i > 0; i--) {
            if (result[i] >= 10) {
                result[i] -= 10;
                result[i-1]++;
            }
        }
        
        for (int n : result) {
            answer += String.valueOf(n);
        }
        
        return answer;
    }
}