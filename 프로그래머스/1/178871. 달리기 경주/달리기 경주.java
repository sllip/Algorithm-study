import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>(players.length);
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String c : callings) {
            String tmp = players[map.get(c)-1];
            players[map.get(c)-1] = c;
            players[map.get(c)] = tmp;
            
            map.put(c, map.get(c)-1);
            map.put(tmp, map.get(tmp)+1);
        }    
        
        return players;
    }
}