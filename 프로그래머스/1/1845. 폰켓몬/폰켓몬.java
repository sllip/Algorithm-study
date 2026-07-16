import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int n : nums) {
            if (!arr.contains(n)) {
                arr.add(n);
            }
        }

        return Math.min(nums.length/2, arr.size());
    }
}