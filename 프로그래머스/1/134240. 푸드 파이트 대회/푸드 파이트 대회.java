class Solution {
    public String solution(int[] food) {
        String answer = "";
        String rev = "";
        
        for (int i = 1; i < food.length; i++) {
            if (food[i]/2 > 0) {
                String r = String.valueOf(i).repeat(food[i]/2);
                answer += r;
                rev = r + rev;
            }
        }
        
        return answer + "0" + rev;
    }
}