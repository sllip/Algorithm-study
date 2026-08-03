class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (String b : babbling) {
            boolean flag = true;
            
            for (String w : words) {
                if (b.contains(w+w)) flag = false;
            }

            if (flag == false) continue;
            if (b.replaceAll("aya|ye|woo|ma", "").length() == 0) answer++;
        }
        
        return answer;
    }
}