import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {    
        HashMap<String, Integer> map = new HashMap<>(terms.length);
        ArrayList<Integer> list = new ArrayList<>();
        
        int year = Integer.parseInt(today.substring(0, 4)) * 12 * 28;
        int month = Integer.parseInt(today.substring(5, 7)) * 28;
        int day = Integer.parseInt(today.substring(8, 10));
        
        for (String t : terms) {
            map.put(t.charAt(0)+"", Integer.parseInt(t.substring(2)));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] date = privacies[i].replace(".", " ").split(" ");
            
            int y = Integer.parseInt(date[0]) * 12 * 28;
            int m = (Integer.parseInt(date[1]) + map.get(date[3])) * 28;
            int d = Integer.parseInt(date[2]) - 1;
            
            if (year+month+day > y+m+d) list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}