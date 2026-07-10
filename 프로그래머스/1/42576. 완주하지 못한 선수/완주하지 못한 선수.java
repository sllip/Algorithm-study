import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>(participant.length);
        
        for (String p : participant) {
            if (map.containsKey(p)) {
                map.replace(p, map.get(p)+1);
            } else {
                map.put(p, 0);
            }
        }
        
        for (String c : completion) {
            map.replace(c, map.get(c)-1);
        }
        
        for (String p : participant) {
            if (map.get(p) != -1) {
                answer = p;
                break;
            }
        }
        
        return answer;
    }
}