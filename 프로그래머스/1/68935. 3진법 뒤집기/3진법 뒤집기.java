class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        
        while (n != 0) {
            str += n%3;
            n /= 3;
        }
        
        int i = str.length()-1;
        for (String s : str.split("")) {
            answer += Integer.parseInt(s)*Math.pow(3, i);
            i--;
        }
        
        return answer;
    }
}