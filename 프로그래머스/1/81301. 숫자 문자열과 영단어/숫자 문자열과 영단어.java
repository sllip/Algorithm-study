class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strs = {"zero", "one", "two", "three", "four",
                    "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < strs.length; i++) {
            s = s.replace(strs[i], String.valueOf(i));
        }
        
        return Integer.parseInt(s);
    }
}