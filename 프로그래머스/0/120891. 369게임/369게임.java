class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        
        for (String s : str.split("")) {
            int n = Integer.parseInt(s);
            if (n % 3 == 0 && n != 0) answer++;
        }
        
        return answer;
    }
}