import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        for (int[] d : data) {
            if (d[map.get(ext)] < val_ext) list.add(d[map.get(sort_by)]);
        }
        
        Collections.sort(list);
        
        int[][] answer = new int[list.size()][4];
        int idx = 0;
        
        for (int l : list) {
            for (int[] d : data) {
                if (d[map.get(sort_by)] == l) answer[idx++] = d;
            }
        }
        
        return answer;
    }
}