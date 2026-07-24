class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (String b : babbling) {
            String str = "";
            
            for (String w : words) {
                int i = b.indexOf(w);
                if (i != -1) str += b.substring(i, i+w.length());
            }
            
            if (str.length() == b.length()) answer++;
        }
        
        return answer;
    }
}