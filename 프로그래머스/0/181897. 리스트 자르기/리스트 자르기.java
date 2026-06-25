import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = new int[num_list.length];
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch (n) {
            case 1:
                answer = Arrays.copyOf(num_list, b+1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b+1);
                break;
            case 4:
                ArrayList<Integer> result = new ArrayList<>();
                
                for (int i = a; i <= b; i+=c) {
                    result.add(num_list[i]);
                }
                
                answer = new int[result.size()];
                for (int i = 0; i < result.size(); i++) {
                    answer[i] = result.get(i);
                }
                break;
        }
        
        return answer;
    }
}