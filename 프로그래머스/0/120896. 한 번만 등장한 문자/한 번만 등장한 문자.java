import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> arr = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for (char key : map.keySet()) {
            if (map.get(key) == 1) arr.add(key);
        }
        
        Collections.sort(arr);
        
        for (char c : arr) {
            answer += c;
        }
        
        return answer;
    }
}