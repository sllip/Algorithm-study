import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>(name.length);
        
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int idx = 0;
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[idx] += map.getOrDefault(photo[i][j], 0);
            }
            idx++;
        }
        
        return answer;
    }
}