import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String,List<String>> map = new HashMap<>(id_list.length);
        HashMap<String,Integer> user = new HashMap<>(id_list.length);
        
        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new ArrayList<>());
            user.put(id_list[i], i);
        }
        
        //key: 신고 받은 id, value: 신고한 id
        for (int i = 0; i < report.length; i++) {
            String[] r = report[i].split(" ");
            
            if (!map.get(r[1]).contains(r[0])) {
                map.get(r[1]).add(r[0]);
            }
        }
        
        for (String id : id_list) {
            if (map.get(id).size() >= k) {
                for (int j = 0; j < map.get(id).size(); j++) {
                    answer[user.get(map.get(id).get(j))]++;
                }
            }
        }
        
        return answer;
    }
}