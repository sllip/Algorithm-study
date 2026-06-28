class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bin = binomial.split(" ");
        
        int a = Integer.parseInt(bin[0]);
        int b = Integer.parseInt(bin[2]);
        
        if (bin[1].equals("+")) {
            answer = a + b;
        } else if (bin[1].equals("-")) {
            answer = a - b;
        } else if (bin[1].equals("*")) {
            answer = a * b;
        }
        
        return answer;
    }
}