import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int n : nums) {
            if (!arr.contains(n)) {
                arr.add(n);
            }
        }
        
        answer = (arr.size() > nums.length / 2) ? nums.length / 2 : arr.size();
        
        return answer;
    }
}