class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int a = 0, b = 0;
        
        for (String p : polynomial.split(" \\+ ")) {
            if (p.contains("x")) {
                a += p.equals("x") ? 1 : Integer.parseInt(p.replace("x",""));
            } else {
                b += Integer.parseInt(p);
            }
        }
        
        if (a == 0) answer = ""+b;
        else if (a == 1) answer = (b == 0) ? "x" : "x + "+b;
        else answer = (b == 0) ? a+"x" : a+"x + "+b;
        
        return answer;
    }
}