class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bin = binomial.split(" ");
        
        int a = Integer.parseInt(bin[0]);
        int b = Integer.parseInt(bin[2]);
        String op = bin[1];
        
        switch (op) {
            case "+" :
                answer = a + b;
                break;
            case "-" :
                answer = a - b;
                break;
            case "*" :
                answer = a * b;
                break;
        }
        
        return answer;
    }
}