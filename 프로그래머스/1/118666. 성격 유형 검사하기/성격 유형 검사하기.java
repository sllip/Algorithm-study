import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        String[] mbti = {"RT", "CF", "JM", "AN"};
        
        for (int i = 0; i < choices.length; i++) {
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            
            if (choices[i] < 4) map.put(c1, map.getOrDefault(c1, 0) + 4-choices[i]);
            else if (choices[i] > 4) map.put(c2, map.getOrDefault(c2, 0) + choices[i]-4);
        }
        
        for (String m : mbti) {
            if (!map.containsKey(m.charAt(1))) answer += m.charAt(0);
            else if (map.containsKey(m.charAt(0))) {
                answer += map.get(m.charAt(0)) < map.get(m.charAt(1)) ? m.charAt(1) : m.charAt(0);
            }
            else answer += m.charAt(1);
        }
        
        return answer;
    }
}