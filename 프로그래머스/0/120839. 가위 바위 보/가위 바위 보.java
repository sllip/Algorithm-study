import java.util.HashMap;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        HashMap<String, String> map = new HashMap<>(rsp.length());
        
        map.put("0", "5");
        map.put("2", "0");
        map.put("5", "2");
        
        for (String r : rsp.split("")) {
            answer += map.get(r);
        }
        
        return answer;
    }
}