class Solution {
    public String solution(String my_string, int[][] queries) {
        String result = "";
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            for (int j = 0; j < s; j++) {
                result += my_string.charAt(j);
            }
            
            for (int k = e; k >= s; k--) {
                result += my_string.charAt(k);
            }
            
            for (int l = e+1; l < my_string.length(); l++) {
                result += my_string.charAt(l);
            }
            
            my_string = result;
            result = "";
        }
        
        return my_string;
    }
}