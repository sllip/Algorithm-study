import java.util.ArrayList;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<>();
        
        for (int i = 97; i < 123; i++) {
            if (skip.contains((char) i + "")) continue;
            list.add((char) i);
        }
        
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            for (n = 0; n < list.size(); n++) {
                if (s.charAt(i) == list.get(n)) break;
            }
            
            n = n+index >= list.size() ? (n+index)%list.size() : n+index;
            answer += list.get(n);
        }
        
        return answer;
    }
}