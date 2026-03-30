class Solution {
    public String solution(String my_string, int[][] queries) {
        String result = "";
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            result += my_string.substring(0, s);
            
            for (int k = e; k >= s; k--) {
                result += my_string.charAt(k);
            }
            
            result += my_string.substring(e+1, my_string.length());
            
            my_string = result;
            result = "";
        }
        
        return my_string;
    }
}