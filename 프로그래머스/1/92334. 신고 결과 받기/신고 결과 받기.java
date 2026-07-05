import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String,List<String>> map = new HashMap<>(id_list.length);
        HashMap<String,Integer> count = new HashMap<>(id_list.length);
        
        for (String id : id_list) {
            map.put(id, new ArrayList<>());
            count.put(id, 0);
        }
        
        for (int i = 0; i < report.length; i++) {
            String[] r = report[i].split(" ");
            
            if (!map.get(r[0]).contains(r[1])) {
                map.get(r[0]).add(r[1]);
                count.put(r[1], count.get(r[1]) + 1);
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            if (count.get(id_list[i]) >= k) {
                
                for (int j = 0; j < map.size(); j++) {
                    if (map.get(id_list[j]).contains(id_list[i])) {
                        answer[j]++;
                    }
                }
            }
        }
        
        return answer;
    }
}